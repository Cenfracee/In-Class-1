package lk.ijse.dep.web.sms.business.custom.impl;

import lk.ijse.dep.web.sms.business.custom.CourseBO;
import lk.ijse.dep.web.sms.dto.CourseDTO;

import java.sql.Connection;


public class CourseBOImpl implements CourseBO {

    @Override
    public void setConnection(Connection connection) throws Exception {

    }

    @Override
    public boolean saveCourse(CourseDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateCourse(CourseDTO dto) {
        return false;
    }

    @Override
    public boolean deleteCourse(String code) {
        return false;
    }

    @Override
    public Object findAllCourses() {
        return null;
    }
}
