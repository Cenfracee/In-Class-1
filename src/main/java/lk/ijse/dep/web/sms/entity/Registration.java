package lk.ijse.dep.web.sms.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="registration")
public class Registration implements SuperEntity  {
    @EmbeddedId
    private RegistrationPK registrationPK;
    @Column(name = "registration_date")
    private Date registrationDate;
    @Setter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "course_code", referencedColumnName = "code", insertable = false, updatable = false)
    private Course course;
    @Setter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;
}
