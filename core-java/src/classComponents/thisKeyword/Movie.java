package classComponents.thisKeyword;

public class Movie {
    int id;
    String title;
    String genre;
    int year;
    String director;
    int rating;

    //zero parameterized constructor
    public Movie() {
        this(1,"x","x",1,"x",1);
//         this(101);
        System.out.println("Zero param constructor");

    }

    //all arguments constructor --> all args constructor
    public Movie(int id, String title, String genre, int year, String director, int rating) {
        //local variable and instance variable have the same name
       // this();
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    //copy constructor
    public Movie(Movie movie){
        this.id = movie.id;
        this.title = movie.title;
        this.genre = movie.genre;
        this.year = movie.year;
        this.director = movie.director;
        this.rating = movie.rating;

    }
    public Movie(int id){
        this.id = id;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie();// call to zero param constructor
        Movie movie2 = new Movie();// call to zero param constructor
        Movie movie3 = new Movie(1, "abcd", "comedy", 2009, "salman", 3);// call to  param constructor
        Movie movie4 = new Movie(movie3);

    }
}
