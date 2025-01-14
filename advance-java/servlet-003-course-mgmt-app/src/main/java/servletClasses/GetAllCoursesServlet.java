package servletClasses;

import controller.CourseController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import model.Course;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/allCourses")
public class GetAllCoursesServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        CourseController courseController = new CourseController();
        List<Course> allCourses = courseController.getAllCourses();
        PrintWriter writer = servletResponse.getWriter();
        writer.println(allCourses);
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
