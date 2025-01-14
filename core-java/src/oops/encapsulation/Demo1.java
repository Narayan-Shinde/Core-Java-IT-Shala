package oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person(21, "Kartik");
        //person.age = -21;//private
        //person.name = "abc"; //private
        person.setAge(-23);
        person.setName("Kaartik");
        System.out.println("Name " + person.getName());
        System.out.println("Age " + person.getAge());

    }
}
