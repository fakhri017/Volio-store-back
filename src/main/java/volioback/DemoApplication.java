package volioback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import volioback.entity.Role;
import volioback.entity.User;
import volioback.service.RoleService;
import volioback.service.UserService;

import java.util.ArrayList;
@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(RoleService roleService , UserService userService){
        return args -> {
            // init roles list
//            roleService.saveRole(Role.builder().name("ADMIN").build());
//            roleService.saveRole(Role.builder().name("USER").build());

            // init users list
//            userService.saveUser( User.builder().email("fakhri@gmail.com").password("fakhri123").username("fakhri").roles(new ArrayList<>()).build()) ;
//            userService.saveUser( User.builder().email("houssem@gmail.com").password("houssem123").username("houssem").roles(new  ArrayList<>()).build()) ;


//			//init role / users
//			userService.addRoleToUser("fakhri" , "ADMIN" );
//			userService.addRoleToUser("sarah" , "USER" );
//			userService.addRoleToUser("Jhon" , "USER" );
        } ;
    }

}
