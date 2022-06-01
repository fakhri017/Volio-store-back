package volioback.controller;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import volioback.domain.entity.Role;
import volioback.service.RoleService;

@RestController
@RequestMapping("/v1/role")
@RequiredArgsConstructor
@Api(value = "Role API")
public class RoleController {

    private final RoleService roleService ;
    /**
     * save a new Role
     * @return role
     */
    @PostMapping(value = "/save")
    public ResponseEntity<Role> save(@RequestBody Role role) {
        return new ResponseEntity<Role>(this.roleService.saveRole(role), HttpStatus.CREATED);
    }

}
