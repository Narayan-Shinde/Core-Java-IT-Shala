package service;

import dao.ExpenseDao;
import model.Expense;

public class ExpenseService {
    ExpenseDao expenseDao = new ExpenseDao();
    public void addExpense(Expense expense) {
        expenseDao.addExpense(expense);
    }

    public void editExpense(Expense expense) {
        expenseDao.editExpense(expense);
    }
}
