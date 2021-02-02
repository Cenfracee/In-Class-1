package lk.ijse.dep.web.sms.business.custom;

import lk.ijse.dep.web.sms.business.SuperBO;
import lk.ijse.dep.web.sms.dto.StudentDTO;

import javax.persistence.EntityManager;
import java.util.List;

public interface StudentBO extends SuperBO {

    boolean saveStudent(StudentDTO dto) throws Exception;

    boolean updateStudent(StudentDTO dto) throws Exception;

    boolean deleteStudent(String studentId) throws Exception;

    List<StudentDTO> findAllStudents() throws Exception;

    void setEntityManager(EntityManager em);

    void deleteStudent(String id);

    Object findAllStudents();
}
