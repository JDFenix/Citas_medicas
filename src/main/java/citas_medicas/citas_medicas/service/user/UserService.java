package citas_medicas.citas_medicas.service.user;


import citas_medicas.citas_medicas.dto.auth.RegisterRequestDto;
import citas_medicas.citas_medicas.dto.user.UserDto;
import citas_medicas.citas_medicas.entity.user.User;
import citas_medicas.citas_medicas.repository.user.IUserRepository;
import citas_medicas.citas_medicas.util.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;



    //estudiar para que es transctional
    @Transactional(readOnly = true)
    public List<User> getAllUser() {
    return iUserRepository.findAll();
    }



    @Transactional
    public UserDto register(RegisterRequestDto registerRequestDto){
        User user = convertToEntity(registerRequestDto);
        //checar el metodo conver to entity
        iUserRepository.save(user);
        return convertToDto(registerRequestDto);
    }

//se usa el dto Data Object Transfer para no mostrar la logica de la entidad en el controlador por buenas practicas
    //basi se encapsula los datos que se ingresen
    public UserDto convertToDto(RegisterRequestDto registerRequestDto){
        return new UserDto(
                registerRequestDto.getName(),
                registerRequestDto.getPaternal_surname(),
                registerRequestDto.getMaternal_surname(),
                registerRequestDto.getEmail(),
                registerRequestDto.getPassword(),
                Role.user
        );
    }


    //se convertierte en entidad ya que el guardado en la bd requiere ua entidad
    public User convertToEntity(RegisterRequestDto registerRequestDto){
        return new User(
                null,
                registerRequestDto.getName(),
                registerRequestDto.getPaternal_surname(),
                registerRequestDto.getMaternal_surname(),
                registerRequestDto.getEmail(),
                registerRequestDto.getPassword(),
                Role.user
        );
    }

}
