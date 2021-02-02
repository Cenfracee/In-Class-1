package lk.ijse.dep.web.sms.business.custom;


import lk.ijse.dep.web.sms.business.SuperBO;
import lk.ijse.dep.web.sms.dto.RegistrationDTO;

import java.util.List;

public interface RegistrationBO extends SuperBO {

    public boolean placeOrder(RegistrationDTO dto) throws Exception;

    List<RegistrationDTO> searchRegistrationByStudentName(String name) throws Exception;
}
