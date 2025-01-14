package objectClassMethods;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@EqualsAndHashCode
public class Student {
    private int id;
    private String name;

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(101);
        student.setName("Sachin");
        System.out.println(student);

    }
}
