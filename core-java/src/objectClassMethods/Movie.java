package objectClassMethods;

import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Movie {
    private int movieId;
    private String movieName;
    private int movieRating;

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie(1, "Lagan", 5);
        System.out.println(movie1);
        System.out.println(movie2);
    }

}
