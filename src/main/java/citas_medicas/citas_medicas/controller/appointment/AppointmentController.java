package citas_medicas.citas_medicas.controller.appointment;


import citas_medicas.citas_medicas.service.appointment.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping

   public String homeBook(Model model) {
       return "book/show";
   }

}
