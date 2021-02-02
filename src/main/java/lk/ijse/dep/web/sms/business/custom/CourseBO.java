package lk.ijse.dep.web.sms.business.custom;



import lk.ijse.dep.web.sms.business.SuperBO;
import lk.ijse.dep.web.sms.dto.CourseDTO;

import javax.persistence.EntityManager;
import java.util.List;

public interface CourseBO extends SuperBO {

    static void deleteCourse(String id) {
    }

    boolean saveCourse(CourseDTO dto) throws Exception;

    boolean updateCourse(CourseDTO dto) throws Exception;

    boolean deleteCourse(String code) throws Exception;

    List<CourseDTO> findAllCourses() throws Exception;


    static void setEntityManager(EntityManager em) {

    }

    Object findAllCourses();

    void updateCourse(CourseDTO dto);
}
