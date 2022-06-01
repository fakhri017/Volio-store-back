package volioback.domain.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collection="User")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {

    /**
     * id
     */
    @Id

    private String id;

    /**
     * email
     */
    private String email;

    /**
     * password
     */
    private String password;

    /**
     * username
     */
    private String username;

    /**
     * lis of roles
     */

    private List <String> roles ;


}
