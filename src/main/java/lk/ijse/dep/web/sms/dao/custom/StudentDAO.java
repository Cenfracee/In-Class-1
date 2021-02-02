package lk.ijse.dep.web.sms.dao.custom;

import lk.ijse.dep.web.sms.entity.Student;

import javax.persistence.EntityManager;

public interface StudentDAO {
    void setEntityManager(EntityManager entityManager);

    void save(Student student);
}
