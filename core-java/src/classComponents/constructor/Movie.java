package classComponents.constructor;

public class Movie {
    int id;
    String title;
    String genre;
    int year;
    String director;
    int rating;

    //zero parameterized constructor
    public Movie() {
        System.out.println("Zero param constructor");
        id = 1;
        title = "maharaja";
        genre = "thriller";
        year = 2024;
        director = "Kartik";
        rating = 9;
    }

    public Movie(int id, String title, String genre, int year, String director, int rating) {
        //local variable and instance variable have the same name
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie();// call to zero param constructor
        Movie movie2 = new Movie();// call to zero param constructor
        Movie movie3 = new Movie(1, "abcd", "comedy", 2009, "salman", 3);// call to  param constructor

    }
}
