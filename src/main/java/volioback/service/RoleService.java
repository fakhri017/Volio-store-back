package volioback.service;


import org.springframework.stereotype.Service;
import volioback.entity.Role;

@Service
public interface RoleService {

    Role saveRole(Role role) ;

}
