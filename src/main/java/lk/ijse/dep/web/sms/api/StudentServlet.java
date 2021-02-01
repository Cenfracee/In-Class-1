package lk.ijse.dep.web.sms.api;

import lk.ijse.dep.web.sms.dto.StudentDTO;
import lk.ijse.dep.web.sms.exception.HttpResponseException;
import lk.ijse.dep.web.sms.exception.ResponseExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

@WebServlet(name = "CourseServlet", value = "/api/v1/students/*")
public class StudentServlet extends HttpServlet {
    final Logger logger = LoggerFactory.getLogger(StudentServlet.class);


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            super.service(req, resp);
        } catch (Throwable t) {
            ResponseExceptionUtil.handle(t, resp);
        }
    }
}
