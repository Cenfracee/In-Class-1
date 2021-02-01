package lk.ijse.dep.web.sms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Registration {
    @EmbeddedId
    private RegistrationPK registrationPK;
    @Column(name = "registration_date")
    private Date registrationDate;
}
