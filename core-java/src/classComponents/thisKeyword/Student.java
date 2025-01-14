package classComponents.thisKeyword;

public class Student {
    int id;
    String name;
    int age;

    //zero param
    public Student() {
        System.out.println("zero param");
    }

    //param
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        //local variable value to instance variable
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
