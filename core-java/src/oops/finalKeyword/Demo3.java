package oops.finalKeyword;

public class Demo3 {
    public static void main(String[] args) {
        class Student {
            final int id;
            final String name;
            final static String collegeName ="PU";

           /* static {
                collegeName = "PU";
            }*/

            public Student() {
                this.id = 0;
                this.name = "";
            }

            public Student(int id, String name) {
                // this();//CTE
                this.id = id;
                this.name = name;
            }
        }
        Student s1 = new Student(1, "abc");
        System.out.println(s1.id + " " + s1.name);
    }
}
