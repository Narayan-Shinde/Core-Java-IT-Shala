package servlets;

import controller.StudentController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

import java.io.IOException;
import java.util.List;

@WebServlet("/student")
public class StudentCurdServlet extends HttpServlet {
    StudentController studentController = new StudentController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");

        Student student = Student.builder()
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .build();

        studentController.addStudent(student);
        resp.getWriter().println("Student added successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        List<Student> allStudents = studentController.getAllStudents();
        resp.getWriter().println(allStudents);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");

        Student student = Student.builder()
                .id(id)
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .build();

        studentController.editStudent(student);
        resp.getWriter().println("Student updated successfully");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int id = Integer.parseInt(req.getParameter("id"));
        Student student = Student.builder()
                .id(id)
                .build();
        studentController.deleteStudent(student);
        resp.getWriter().println("Student deleted successfully");
    }
}
