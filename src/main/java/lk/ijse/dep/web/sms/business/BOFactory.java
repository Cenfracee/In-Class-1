package lk.ijse.dep.web.sms.business;


import lk.ijse.dep.web.sms.business.custom.impl.CourseBOImpl;
import lk.ijse.dep.web.sms.business.custom.impl.RegistrationBOImpl;
import lk.ijse.dep.web.sms.business.custom.impl.StudentBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        return (boFactory == null)? (boFactory = new BOFactory()): boFactory;
    }

    public <T extends SuperBO> T getBO(BOTypes boType){
        switch (boType){
            case STUDENT:
                return (T) new StudentBOImpl();
            case COURSE:
                return (T) new CourseBOImpl();
            case REGISTRATION:
                return (T)  new RegistrationBOImpl();
            default:
                return null;
        }
    }
}
