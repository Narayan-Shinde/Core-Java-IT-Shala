import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "loginFilter", urlPatterns = {"/servlet1"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //get data from database : username, password
        //query = select username, password from users where username=? and password=? limit 1
        String dbUsername;
        String dbPassword;

        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
          chain.doFilter(request, response);
        } else {
            response.getWriter().println("<h1 style='color:red'>Invalid Credentials</h1>");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.include(request, response);
        }
    }
}
