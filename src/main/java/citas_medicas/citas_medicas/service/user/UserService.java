package citas_medicas.citas_medicas.service.user;


import citas_medicas.citas_medicas.repository.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;




}
