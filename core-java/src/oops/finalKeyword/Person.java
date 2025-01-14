package oops.finalKeyword;

class Person {
    final private int id = 123;
    final private String name ="abc";


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        Person p = new Person();
       /* p.id = 123;
        p.name = "John";*/
    }
}