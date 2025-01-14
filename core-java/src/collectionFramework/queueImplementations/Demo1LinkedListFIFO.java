package collectionFramework.queueImplementations;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1LinkedListFIFO {
    public static void main(String[] args) {
        //FIFO - First In First Out
        Queue queue = new LinkedList();

        //insertion
        queue.add("yash");
        queue.add("satish");
        queue.add("vishwadeep");
        queue.add("ashish");
        queue.add("sanika");
        queue.add("mahetab");

        //queue.offer("123");//


        //deletion
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.poll());//null --> when we try remove element from empty queue
        //System.out.println(queue.remove());//exception --> when we try remove element from empty queue

        //inspection
        System.out.println("who is last : "+queue.peek()); // null
        System.out.println("who is last : "+queue.element());//exception
    }
}
