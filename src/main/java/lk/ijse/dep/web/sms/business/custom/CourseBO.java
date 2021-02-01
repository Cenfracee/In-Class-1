package lk.ijse.dep.web.sms.business.custom;



import lk.ijse.dep.web.sms.business.SuperBO;
import lk.ijse.dep.web.sms.dto.CourseDTO;

import javax.persistence.EntityManager;
import java.util.List;

public interface CourseBO extends SuperBO {

    static void deleteCourse(String id) {
    }

    boolean saveItem(CourseDTO dto) throws Exception;

    boolean updateItem(CourseDTO dto) throws Exception;

    boolean deleteItem(String code) throws Exception;

    List<CourseDTO> findAllItems() throws Exception;

    static void setEntityManager(EntityManager em) {

    }

}
