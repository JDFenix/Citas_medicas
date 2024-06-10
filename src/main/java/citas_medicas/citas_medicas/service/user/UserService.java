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

    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return iUserRepository.findAll();
    }

    @Transactional
    public UserDto register(RegisterRequestDto registerRequestDto){
        User user = convertToEntity(registerRequestDto);
        iUserRepository.save(user);
        return convertToDto(user);
    }

    public UserDto convertToDto(User user){
        return new UserDto(
                user.getUsuarname(),
                user.getNumber(),
                user.getRole()
        );
    }

    public User convertToEntity(RegisterRequestDto registerRequestDto){
        return new User(
                null,
                registerRequestDto.getUsuarname(),
                registerRequestDto.getNumber(),
                Role.user
        );
    }
}
