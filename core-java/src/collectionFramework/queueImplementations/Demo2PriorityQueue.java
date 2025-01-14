package collectionFramework.queueImplementations;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2PriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

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
