package volioback.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import volioback.domain.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {

Optional<Role> findByName(String name ) ;

}
