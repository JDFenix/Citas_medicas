package citas_medicas.citas_medicas.repository.appointment;

import citas_medicas.citas_medicas.entity.appointment.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment,Long> {
}
