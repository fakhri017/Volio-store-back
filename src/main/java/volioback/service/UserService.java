package volioback.service;



import org.springframework.stereotype.Service;
import volioback.domain.entity.User;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user) ;
    User getUserByUserName(String username) ;
//    void addRoleToUser(String username  , String roleNAme) ;
    List<User> getUsers() ;
}
