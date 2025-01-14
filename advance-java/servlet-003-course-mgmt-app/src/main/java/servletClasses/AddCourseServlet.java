package servletClasses;

import controller.CourseController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import model.Course;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addCourse")
public class AddCourseServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AddCourseServlet::init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("AddCourseServlet::service");

        String name = servletRequest.getParameter("name");
        String description = servletRequest.getParameter("description");
        String duration = servletRequest.getParameter("duration");
        int fees = Integer.parseInt(servletRequest.getParameter("fees"));

        Course course = Course.builder()
                .name(name)
                .description(description)
                .duration(duration)
                .fees(fees)
                .build();

        CourseController courseController = new CourseController();
        courseController.addCourse(course);

        PrintWriter writer = servletResponse.getWriter();
        writer.println("Course Added Successfully.");


    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("AddCourseServlet::destroy");
    }
}
