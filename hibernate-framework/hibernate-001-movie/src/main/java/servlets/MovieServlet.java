package servlets;

import controller.MovieController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Movie;

import java.io.IOException;

@WebServlet("/movie")
public class MovieServlet extends HttpServlet {

    MovieController movieController = new MovieController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String director = req.getParameter("director");
        int year = Integer.parseInt(req.getParameter("year"));

        Movie movie = Movie.builder()
                .title(title)
                .director(director)
                .year(year)
                .build();
        movieController.addMovie(movie);

        resp.getWriter().println("Added movie");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String director = req.getParameter("director");
        int year = Integer.parseInt(req.getParameter("year"));

        Movie movie = Movie.builder()
                .id(id)
                .title(title)
                .director(director)
                .year(year)
                .build();
        movieController.editMovie(movie);

        resp.getWriter().println("Edited movie");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Movie movie = movieController.getMovieById(id);
        resp.getWriter().println(movie);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        movieController.deleteMovieById(id);
        resp.getWriter().println("Movie deleted");
    }

}
