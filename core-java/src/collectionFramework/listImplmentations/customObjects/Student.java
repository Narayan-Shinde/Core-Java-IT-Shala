package collectionFramework.listImplmentations.customObjects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String city;

    @Override
    public int compareTo(Student student) {
        //positive : first is greater than second
        //negative : first is smaller than second
        //zero - equal
//        return this.id - student.id; //asc -> sorting based on id
//        return student.id - this.id; //desc -> sorting based on id
        return this.name.compareTo(student.name); //asc
    }
}
