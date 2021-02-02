package lk.ijse.dep.web.sms.api;

import lk.ijse.dep.web.sms.business.BOFactory;
import lk.ijse.dep.web.sms.business.BOTypes;
import lk.ijse.dep.web.sms.business.custom.CourseBO;
import lk.ijse.dep.web.sms.dto.CourseDTO;
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

@WebServlet(name = "CourseServlet", value = "/api/v1/courses/*")
public class CourseServlet extends HttpServlet {
    final Logger logger = LoggerFactory.getLogger(CourseServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jsonb jsonb = JsonbBuilder.create();

        final EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();

        try{
            resp.setContentType("application/json");
            CourseBO courseBO = BOFactory.getInstance().getBO(BOTypes.COURSE);
            CourseBO.setEntityManager(em);
            resp.getWriter().println(jsonb.toJson(courseBO.findAllCourses()));

        } catch (Throwable t) {
            ResponseExceptionUtil.handle(t, resp);
        } finally {
            em.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jsonb jsonb = JsonbBuilder.create();
        final EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();

        try{
            CourseDTO dto = jsonb.fromJson(req.getReader(), CourseDTO.class);

            if (dto.getCode() == null || dto.getCode().trim().isEmpty() || dto.getDescription() == null ) {
                throw new HttpResponseException(400, "Invalid customer details", null);
            }

            CourseBO courseBO = BOFactory.getInstance().getBO(BOTypes.COURSE);
            CourseBO.setEntityManager(em);
            courseBO.saveCourse(dto);
            resp.setStatus(HttpServletResponse.SC_CREATED);
            resp.setContentType("application/json");
            resp.getWriter().println(jsonb.toJson(dto));
        } catch (SQLIntegrityConstraintViolationException exp) {
            throw new HttpResponseException(400, "Duplicate entry", exp);
        } catch (JsonbException exp) {
            throw new HttpResponseException(400, "Failed to read the JSON", exp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            em.close();
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();

        try{

            if (req.getPathInfo() == null || req.getPathInfo().replace("/", "").trim().isEmpty()) {
                throw new HttpResponseException(400, "Invalid course code", null);
            }

            String id = req.getPathInfo().replace("/", "");

            CourseBO courseBO = BOFactory.getInstance().getBO(BOTypes.COURSE);
            CourseBO.setEntityManager(em);
            CourseBO.deleteCourse(id);
            resp.setStatus(HttpServletResponse.SC_NO_CONTENT);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();

        try{

            if (req.getPathInfo() == null || req.getPathInfo().replace("/", "").trim().isEmpty()) {
                throw new HttpResponseException(400, "Invalid course code", null);
            }

            String id = req.getPathInfo().replace("/", "");
            Jsonb jsonb = JsonbBuilder.create();
            CourseDTO dto = jsonb.fromJson(req.getReader(), CourseDTO.class);

            if (dto.getCode() != null || dto.getDescription().trim().isEmpty()) {
                throw new HttpResponseException(400, "Invalid details", null);
            }

            CourseBO courseBO = BOFactory.getInstance().getBO(BOTypes.COURSE);
            CourseBO.setEntityManager(em);
            courseBO.updateCourse(dto);
            resp.setStatus(HttpServletResponse.SC_NO_CONTENT);

        } catch (JsonbException exp) {
            throw new HttpResponseException(400, "Failed to read the JSON", exp);
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
