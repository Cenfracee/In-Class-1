package lk.ijse.dep.web.sms.business.custom.impl;

import lk.ijse.dep.web.sms.business.custom.CourseBO;
import lk.ijse.dep.web.sms.dto.CourseDTO;

import java.sql.Connection;
import java.util.List;

public class CourseBOImpl implements CourseBO {
    @Override
    public void setConnection(Connection connection) throws Exception {

    }

    @Override
    public boolean saveItem(CourseDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateItem(CourseDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteItem(String code) throws Exception {
        return false;
    }

    @Override
    public List<CourseDTO> findAllItems() throws Exception {
        return null;
    }
}
