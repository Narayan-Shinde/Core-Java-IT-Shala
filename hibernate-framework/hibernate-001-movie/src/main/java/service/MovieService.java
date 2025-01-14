package service;

import dao.MovieDao;
import model.Movie;

public class MovieService {

    MovieDao movieDao = new MovieDao();

    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }

    public void editMovie(Movie movie) {
        movieDao.editMovie(movie);
    }

    public Movie getMovieById(int id) {
        return movieDao.getMovieById(id);
    }

    public void deleteMovieById(int id) {
        movieDao.deleteMovieById(id);
    }
}