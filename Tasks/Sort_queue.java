package Projects.Tasks;

import java.util.*;

// Use a queue to sort numbers like [5,2,8]

public class Sort_queue {
    public static void main(String[] args) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(5);
        minheap.add(2);
        minheap.add(8);

        System.out.println("Sorted List : ");
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ");
        }
    }
}
