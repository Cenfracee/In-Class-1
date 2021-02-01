package lk.ijse.dep.web.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO implements Serializable {
    private int status;
    private String error;
    private String message;
}
