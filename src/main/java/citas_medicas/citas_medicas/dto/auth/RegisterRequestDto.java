package citas_medicas.citas_medicas.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequestDto {
    public String name;
    public String paternal_surname;
    public String maternal_surname;
    public String email;
    public String password;
}
