package xushnud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
   private Integer id;
    private String name;
    private String phone;
    private String password;
    private String role;
    private Boolean status;
}
