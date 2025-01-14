import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(value = "/calculate", loadOnStartup = 1)
public class Calculator implements Servlet {

    public Calculator() {
        System.out.println("Calculator::constructor");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Calculator :: init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Calculator :: service");

        int number1 = Integer.parseInt(servletRequest.getParameter("number1"));
        int number2 = Integer.parseInt(servletRequest.getParameter("number2"));
        String operation = servletRequest.getParameter("operation");

        String result = switch (operation) {
            case "+" -> Integer.toString(number1 + number2);
            case "-" -> Integer.toString(number1 - number2);
            case "*" -> Integer.toString(number1 * number2);
            case "/" -> Integer.toString(number1 / number2);
            case "%" -> Integer.toString(number1 % number2);
            default -> "Invalid input";
        };

        PrintWriter writer = servletResponse.getWriter();
        writer.println("Result is " + result);
        writer.println("Current time is "+ LocalDateTime.now());

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("Calculator :: destroy");
    }
}
