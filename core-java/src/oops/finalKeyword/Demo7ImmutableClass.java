package oops.finalKeyword;

public class Demo7ImmutableClass {
    public static void main(String[] args) {

        final class Person {
            final private int id;
            final private String name;

            public Person(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Person person = new Person(101, "sanju");
        /*person.id = 1111;
        person.name = "john";*/
    }
}
