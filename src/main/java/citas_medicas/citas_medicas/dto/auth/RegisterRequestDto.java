package citas_medicas.citas_medicas.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequestDto {
    public String usuarname;
    public String number;
}
