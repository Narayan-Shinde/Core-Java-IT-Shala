package collectionFramework.queueImplementations;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3PriorityQueue {
    public static void main(String[] args) {
        //to process the element is descending order
        Comparator<String> comparator = (s1, s2) -> s2.compareTo(s1);
        Queue<String> queue = new PriorityQueue<>(comparator);
        //by default priority is ascending order of elements
        //insertion
        queue.add("yash");
        queue.add("satish");
        queue.add("vishwadeep");
        queue.add("ashish");
        queue.add("sanika");
        queue.add("mahetab");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
