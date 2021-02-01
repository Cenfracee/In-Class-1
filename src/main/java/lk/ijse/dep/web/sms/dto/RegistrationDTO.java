package lk.ijse.dep.web.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDTO {
    private String code;
    private String id;
    private Date registrationDate;
}
