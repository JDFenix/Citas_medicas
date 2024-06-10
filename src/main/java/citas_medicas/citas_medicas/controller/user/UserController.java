package citas_medicas.citas_medicas.controller.user;

import citas_medicas.citas_medicas.dto.auth.RegisterRequestDto;
import citas_medicas.citas_medicas.dto.user.UserDto;
import citas_medicas.citas_medicas.entity.user.User;
import citas_medicas.citas_medicas.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@ModelAttribute RegisterRequestDto registerRequestDto, Model model) {
        UserDto user = userService.register(registerRequestDto);
        model.addAttribute("users", user);
        return "exampleView";
    }

    @GetMapping("/allUsers")
    public String allUsers(Model model){
        List<User> allUsers = userService.getAllUser();
        model.addAttribute("users", allUsers);
        return "exampleView";
    }
}

