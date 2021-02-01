package lk.ijse.dep.web.sms.entity;

import lk.ijse.dep.web.sms.entity.embed.Audience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course implements SuperEntity {
    @Id
    private String code;
    private String description;
    private String duration;
    private Audience audience;

}
