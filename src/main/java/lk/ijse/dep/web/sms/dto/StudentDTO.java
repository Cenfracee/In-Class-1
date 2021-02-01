package lk.ijse.dep.web.sms.dto;

import lk.ijse.dep.web.sms.entity.embed.Address;
import lk.ijse.dep.web.sms.entity.embed.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private String id;
    private String studentName;
    private String contact;
    private Date dob;
    private Gender gender;
    private Address address;
}
