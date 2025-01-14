import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String key = req.getParameter("key");

        Cookie cookie = new Cookie("key", key);
        cookie.setMaxAge(60 * 24 * 365 * 10);
        resp.addCookie(cookie);


        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Search Result</h1> <hr/>");
        writer.println(LocalDateTime.now());
    }
}
