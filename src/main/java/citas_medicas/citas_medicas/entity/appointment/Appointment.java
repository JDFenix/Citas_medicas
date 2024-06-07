package citas_medicas.citas_medicas.entity.appointment;

import citas_medicas.citas_medicas.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private Date date;


    @ManyToOne
    @JoinColumn(name = "id_user",nullable = false)
    private User user;



}
