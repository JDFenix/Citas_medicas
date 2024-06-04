package citas_medicas.citas_medicas.service.auth;


import citas_medicas.citas_medicas.dto.auth.RegisterRequestDto;
import citas_medicas.citas_medicas.dto.user.UserDto;
import citas_medicas.citas_medicas.entity.user.User;
import citas_medicas.citas_medicas.repository.user.IUserRepository;
import citas_medicas.citas_medicas.util.Role;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthenticationService {


    @Autowired
    private IUserRepository iUserRepository;

@Transactional
    public UserDto register(RegisterRequestDto registerRequestDto){
    User user = convertToEntity(registerRequestDto);
     iUserRepository.save(user);
   return null;
    }


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
