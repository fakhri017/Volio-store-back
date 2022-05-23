package volioback.service.Impl;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import volioback.entity.Role;
import volioback.repository.RoleRepository;
import volioback.service.RoleService;


@Service

@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository ;


    @Override
    public Role saveRole(Role role) {
        log.info("saving rule   : {} " , role.getName());
        return roleRepository.save( role );
    }
}
