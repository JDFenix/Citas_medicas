package citas_medicas.citas_medicas.dto.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    public String name;
    public String paternal_surname;
    public String maternal_surname;
    public String email;
    public String password;
}
