package dao;

import lombok.SneakyThrows;
import model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MovieDao {

    @SneakyThrows
    public void addMovie(Movie movie) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(movie);
        transaction.commit();
        session.close();
    }

    @SneakyThrows
    public void editMovie(Movie movie) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(movie);
        transaction.commit();
        session.close();
    }

    @SneakyThrows
    public void addMovieUsingJdbc(Movie movie) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/movie_db";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "insert into movie(title,director, year) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, movie.getTitle());
        preparedStatement.setString(2, movie.getDirector());
        preparedStatement.setInt(3, movie.getYear());
        preparedStatement.executeUpdate();
        connection.close();
    }

    public Movie getMovieById(int id) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Movie movie = session.get(Movie.class, id);
        session.close();
        return movie;
    }

    public void deleteMovieById(int id) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.get(Movie.class, id));
        transaction.commit();
        session.close();
    }
}
