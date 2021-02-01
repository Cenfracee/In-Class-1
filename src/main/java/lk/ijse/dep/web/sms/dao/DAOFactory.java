package lk.ijse.dep.web.sms.dao;

import lk.ijse.dep.web.sms.dao.custom.impl.CourseDAOImpl;
import lk.ijse.dep.web.sms.dao.custom.impl.QueryDAOImpl;
import lk.ijse.dep.web.sms.dao.custom.impl.RegistrationDAOImpl;
import lk.ijse.dep.web.sms.dao.custom.impl.StudentDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return (daoFactory != null) ? daoFactory : (daoFactory = new DAOFactory());
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoType) {
        switch (daoType) {
            case STUDENT:
                return (T) new StudentDAOImpl();
            case COURSE:
                return (T) new CourseDAOImpl();
            case REGISTRATION:
                return (T) new RegistrationDAOImpl();
            case QUERY:
                return (T) new QueryDAOImpl();
            default:
                return null;
        }
    }

}
