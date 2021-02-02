package lk.ijse.dep.web.sms.dao.custom;


import lk.ijse.dep.web.sms.dao.SuperDAO;

import javax.persistence.EntityManager;

public interface QueryDAO extends SuperDAO {
    void setEntityManager(EntityManager entityManager);
}
