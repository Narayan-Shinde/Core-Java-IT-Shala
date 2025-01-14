package collectionFramework.setImplementations;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Student/* implements Comparable<Student>*/ {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String city;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

  /*  @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }*/
}