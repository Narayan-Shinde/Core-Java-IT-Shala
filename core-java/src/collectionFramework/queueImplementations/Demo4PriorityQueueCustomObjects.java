package collectionFramework.queueImplementations;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4PriorityQueueCustomObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee(23, "satish", 23000);
        Employee employee2 = new Employee(2, "yash", 13000);
        Employee employee3 = new Employee(13, "ashish", 3000);
        Employee employee4 = new Employee(7, "kundan", 43000);
        Employee employee5 = new Employee(19, "sanika", 143000);
        Employee employee6 = new Employee(27, "amruta", 93000);


        //Comparator<Employee> employeeComparator = (e1, e2)->e2.getId()-e1.getId();
        Comparator<Employee> employeeComparator = (e1, e2)->e2.getSalary()-e1.getSalary();

        Queue<Employee> employeeQueue = new PriorityQueue<>(employeeComparator);
        employeeQueue.add(employee1);
        employeeQueue.add(employee2);
        employeeQueue.add(employee3);
        employeeQueue.add(employee4);
        employeeQueue.add(employee5);
        employeeQueue.add(employee6);

        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
    }
}
