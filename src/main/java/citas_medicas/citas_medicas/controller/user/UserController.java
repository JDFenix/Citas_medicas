package citas_medicas.citas_medicas.controller.user;


import citas_medicas.citas_medicas.dto.auth.RegisterRequestDto;
import citas_medicas.citas_medicas.dto.user.UserDto;
import citas_medicas.citas_medicas.entity.user.User;
import citas_medicas.citas_medicas.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//estudiar el archivo application.propierties esta en resources/templates
//en ese archivo configuraran sus propias credenciales de la config de xampp o wampp

//estudiar para que es @controller
@Controller
//estudiar para que sirve request mapping
@RequestMapping("/user")
public class UserController {

    //estudiar para que es autowired
    @Autowired
    private UserService userService;

    //solo es ejemplo no redirecciona a ningun lugar
    //vean el dto que se llama registerRequestDto
    //estudiar para que sirve PostMapping
    @PostMapping("/register")
    public String register(Model model, @RequestBody RegisterRequestDto registerRequestDto) {
//checar el service del user
        UserDto user = userService.register(registerRequestDto);
        //retorna a una vista la variable listAllUser con la clave users
        model.addAttribute("users", user);
        return "exampleView";
    }



    @GetMapping("/allUsers")
    public String allUsers(Model model){
        List<User> allUsers =  userService.getAllUser();
        model.addAttribute("users",allUsers);
        return "exampleView";
    }
}
