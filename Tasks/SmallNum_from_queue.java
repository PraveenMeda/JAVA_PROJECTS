package Projects.Tasks;

import java.util.*;
// smallest value from list using queue pol
public class SmallNum_from_queue {
    public static void main(String[] args) {
        Queue<Integer> minheap = new PriorityQueue<>();
        minheap.add(5);
        minheap.add(2);
        minheap.add(8);

        System.out.print("The smallest Value from list : "+minheap.poll() + " ");
    }
}
