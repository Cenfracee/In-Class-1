package lk.ijse.dep.web.sms.dao;

import javax.persistence.EntityManager;

public interface SuperDAO {

    public void setEntityManager(EntityManager entityManager) throws Exception;

}
