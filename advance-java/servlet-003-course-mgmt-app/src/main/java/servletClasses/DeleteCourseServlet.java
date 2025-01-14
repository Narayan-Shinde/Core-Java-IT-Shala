package servletClasses;

import controller.CourseController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/deleteCourse")
public class DeleteCourseServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int id = Integer.parseInt(servletRequest.getParameter("id"));
        CourseController courseController = new CourseController();
        courseController.deleteCourse(id);
        servletResponse.getWriter().println("Course Deleted Successfully");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
