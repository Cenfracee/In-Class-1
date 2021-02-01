package lk.ijse.dep.web.sms.dto;


import lk.ijse.dep.web.sms.entity.embed.Audience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private String code;
    private String description;
    private String duration;
    private Audience audience;
}
