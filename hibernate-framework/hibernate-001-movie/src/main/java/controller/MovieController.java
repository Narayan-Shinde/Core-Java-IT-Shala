package controller;

import model.Movie;
import service.MovieService;

public class MovieController {

    MovieService movieService = new MovieService();

    public void addMovie(Movie movie) {
        movieService.addMovie(movie);
    }

    public void editMovie(Movie movie) {
        movieService.editMovie(movie);
    }

    public Movie getMovieById(int id) {
        return movieService.getMovieById(id);
    }

    public void deleteMovieById(int id) {
        movieService.deleteMovieById(id);
    }
}