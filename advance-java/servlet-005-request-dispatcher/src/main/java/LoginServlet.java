import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        if (username.equals("admin") && password.equals("admin")) {
            //welcome page
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, resp);
        } else {
            //login page
            resp.getWriter().println("<h2 style='color:red'>Invalid username or password</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, resp);
        }
    }
}
