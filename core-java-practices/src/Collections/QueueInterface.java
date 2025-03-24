package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Uses correct Queue interface
        queue.add(6);
        queue.add(16);
        queue.add(9);
        System.out.println(queue.poll());
        System.out.println(queue.element());


//                Queue<Integer> queue = new PriorityQueue<>();
//                queue.add(15);
//                queue.add(5);
//                queue.add(25);
//
//                System.out.println(queue.element()); // Output: 5 (smallest element in min-heap)
            }
        }
