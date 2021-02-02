package lk.ijse.dep.web.sms.business.custom.impl;


import lk.ijse.dep.web.sms.business.custom.RegistrationBO;
import lk.ijse.dep.web.sms.dto.RegistrationDTO;

import java.sql.Connection;
import java.util.List;

public class RegistrationBOImpl implements RegistrationBO {

    @Override
    public void setConnection(Connection connection) throws Exception {

    }

    @Override
    public boolean placeOrder(RegistrationDTO dto) throws Exception {
        return false;
    }

    @Override
    public List<RegistrationDTO> searchRegistrationByStudentName(String name) throws Exception {
        return null;
    }


}
