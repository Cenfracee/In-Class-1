package lk.ijse.dep.web.sms.entity;


import lk.ijse.dep.web.sms.entity.embed.Address;
import lk.ijse.dep.web.sms.entity.embed.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name="student")
public class Student implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="student_name")
    private String studentName;
    private String contact;
    private Date dob;
    private Gender gender;
    private Address address;

}
