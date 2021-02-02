package lk.ijse.dep.web.sms.business.custom.impl;


import lk.ijse.dep.web.sms.business.custom.StudentBO;
import lk.ijse.dep.web.sms.dao.DAOFactory;
import lk.ijse.dep.web.sms.dao.DAOTypes;
import lk.ijse.dep.web.sms.dao.custom.StudentDAO;
import lk.ijse.dep.web.sms.dto.StudentDTO;
import lk.ijse.dep.web.sms.entity.Student;

import javax.persistence.EntityManager;
import java.sql.Connection;
import java.util.List;

public class StudentBOImpl implements StudentBO {

    private StudentDAO studentDAO;
    private EntityManager entityManager;

    public StudentBOImpl() {
        studentDAO = DAOFactory.getInstance().getDAO(DAOTypes.STUDENT);
    }

    @Override
    public void setConnection(Connection connection) throws Exception {

    }

    @Override
    public boolean saveStudent(StudentDTO dto) throws Exception {
        try{
        entityManager.getTransaction().begin();
        studentDAO.save(new Student(dto.getId(), dto.getStudentName(), dto.getContact(),dto.getDob(),dto.getGender(),dto.getAddress()));
        entityManager.getTransaction().commit();
        return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudent(String customerId) throws Exception {
        return false;
    }

    @Override
    public List<StudentDTO> findAllStudents() throws Exception {
        return null;
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.entityManager = entityManager;
        studentDAO.setEntityManager(entityManager);
    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public Object findAllStudents() {
        return null;
    }
}
