package classComponents.thisKeyword;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Sanju", 23);


        s1.setId(202);
        s1.setName("Salman");
        s1.setAge(25);

        s2.setId(1);
        s2.setName("Arti");
        s2.setAge(21);

        System.out.println(s1.id + "\t" + s1.name + "\t" + s1.age);
        System.out.println(s2.id + "\t" + s2.name + "\t" + s2.age);

    }
}
