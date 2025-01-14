package collectionFramework.queueImplementations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee /*implements Comparable<Employee> */{
    private int id;
    private String name;
    private int salary;

    /*@Override
    public int compareTo(Employee o) {
        return o.salary - this.salary;
    }*/
}
