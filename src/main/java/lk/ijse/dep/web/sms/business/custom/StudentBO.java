package lk.ijse.dep.web.sms.business.custom;

import lk.ijse.dep.web.sms.business.SuperBO;
import lk.ijse.dep.web.sms.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {

    boolean saveCustomer(StudentDTO dto) throws Exception;

    boolean updateCustomer(StudentDTO dto) throws Exception;

    boolean deleteCustomer(String customerId) throws Exception;

    List<StudentDTO> findAllCustomers() throws Exception;
}
