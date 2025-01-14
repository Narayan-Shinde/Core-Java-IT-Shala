package dao;

import model.Expense;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import static util.HibernateUtil.getSessionFactory;

public class ExpenseDao {
    public void addExpense(Expense expense) {
        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(expense);
        transaction.commit();
        session.close();
    }

    public void editExpense(Expense expense) {
        SessionFactory sf = getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(expense);
        transaction.commit();
        session.close();
    }


}
//CRUD
//Create - Add
//Read - Get
//Update
//Delete