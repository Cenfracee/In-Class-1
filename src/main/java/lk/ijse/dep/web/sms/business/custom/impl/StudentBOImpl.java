package lk.ijse.dep.web.sms.business.custom.impl;


import lk.ijse.dep.web.sms.business.custom.StudentBO;
import lk.ijse.dep.web.sms.dto.StudentDTO;

import java.sql.Connection;
import java.util.List;

public class StudentBOImpl implements StudentBO {


    @Override
    public void setConnection(Connection connection) throws Exception {

    }

    @Override
    public boolean saveCustomer(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateCustomer(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(String customerId) throws Exception {
        return false;
    }

    @Override
    public List<StudentDTO> findAllCustomers() throws Exception {
        return null;
    }
}
