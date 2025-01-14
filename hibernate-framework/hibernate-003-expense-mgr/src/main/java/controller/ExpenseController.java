package controller;

import model.Expense;
import service.ExpenseService;

public class ExpenseController {

    ExpenseService expenseService = new ExpenseService();

    public void addExpense(Expense expense) {
        expenseService.addExpense(expense);
    }

    public void editExpense(Expense expense) {
        expenseService.editExpense(expense);
    }
}
