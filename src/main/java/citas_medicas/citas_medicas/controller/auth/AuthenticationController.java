package citas_medicas.citas_medicas.controller.auth;

import citas_medicas.citas_medicas.dto.auth.RegisterRequestDto;
import citas_medicas.citas_medicas.service.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    //retorno formulario de inicio de sesion
    @GetMapping("/loginFormC")
    public String loginForm(Model model) {
        return "auth/loginFormC";
    }


}
