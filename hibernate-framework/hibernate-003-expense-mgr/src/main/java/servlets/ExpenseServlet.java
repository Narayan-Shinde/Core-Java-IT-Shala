package servlets;

import controller.ExpenseController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Expense;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@WebServlet("/expense")
public class ExpenseServlet extends HttpServlet {
    ExpenseController expenseController = new ExpenseController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        LocalDate date = LocalDate.parse(req.getParameter("date"));
        String title = req.getParameter("title");
        double amount = Double.parseDouble(req.getParameter("amount"));
        String description = req.getParameter("description");

        Expense expense = Expense.builder()
                .date(date)
                .title(title)
                .amount(amount)
                .description(description)
                .build();

        expenseController.addExpense(expense);

        PrintWriter out = resp.getWriter();
        out.println("Expense Added Successfully");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UUID id = UUID.fromString(req.getParameter("id"));
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        String title = req.getParameter("title");
        double amount = Double.parseDouble(req.getParameter("amount"));
        String description = req.getParameter("description");

        Expense expense = Expense.builder()
                .id(id)
                .date(date)
                .title(title)
                .amount(amount)
                .description(description)
                .build();

        expenseController.editExpense(expense);

        PrintWriter out = resp.getWriter();
        out.println("Expense Updated Successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Expense> expenseList = expenseController.getAllExpenses();

        resp.getWriter().println(expenseList);
    }
}
