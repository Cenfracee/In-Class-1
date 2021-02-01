package lk.ijse.dep.web.sms.entity;


import lk.ijse.dep.web.sms.entity.embed.Address;
import lk.ijse.dep.web.sms.entity.embed.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements SuperEntity{
    @Id
    private String id;
    @Column(name="student_name")
    private String studentName;
    private String contact;
    private Date dob;
    private Gender gender;
    private Address address;
    private List<Course> courseList;

}
