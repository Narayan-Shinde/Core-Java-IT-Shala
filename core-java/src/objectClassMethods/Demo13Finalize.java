package objectClassMethods;

public class Demo13Finalize {
    public static void main(String[] args) {
        Movie movie1 = new Movie(); //garbage
        Movie movie2 = new Movie();
        movie1 = movie2;
    }
}
