package lk.ijse.dep.web.sms.api;

import lk.ijse.dep.web.sms.business.BOFactory;
import lk.ijse.dep.web.sms.business.BOTypes;
import lk.ijse.dep.web.sms.business.custom.StudentBO;
import lk.ijse.dep.web.sms.exception.HttpResponseException;
import lk.ijse.dep.web.sms.exception.ResponseExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CourseServlet", value = "/api/v1/students/*")
public class StudentServlet extends HttpServlet {
    final Logger logger = LoggerFactory.getLogger(StudentServlet.class);

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();

        try {

            if (req.getPathInfo() == null || req.getPathInfo().replace("/", "").trim().isEmpty()) {
                throw new HttpResponseException(400, "Invalid student", null);
            }

            String id = req.getPathInfo().replace("/", "");

            StudentBO studentBO = BOFactory.getInstance().getBO(BOTypes.COURSE);
            studentBO.setEntityManager(em);
            studentBO.deleteStudent(id);
            resp.setStatus(HttpServletResponse.SC_NO_CONTENT);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            super.service(req, resp);
        } catch (Throwable t) {
            ResponseExceptionUtil.handle(t, resp);
        }
    }
}
