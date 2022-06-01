package volioback.service;


import org.springframework.stereotype.Service;
import volioback.domain.entity.Role;

@Service
public interface RoleService {

    Role saveRole(Role role) ;

}
