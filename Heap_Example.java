import java.util.*;

// Heap is a special tree of binary tree.
// Heap is a complete binary tree.
// Heap is a binary tree where the smaller number is always on top like minheap and the bigger number is always on top like maxheap.

public class Heap_Example {

    //Heap is a special tree where the numbers are like kids standing in a line.Everyone follows a rule.
    //The smaller number is always on top like minheap and the bigger number is always on top like maxheap.

    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(20);
        minheap.add(5);
        minheap.add(15);
        minheap.add(10);

        System.out.println("Min Heap output : ");
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ");
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(20);
        maxheap.add(5);
        maxheap.add(15);
        maxheap.add(10);

        System.out.println("\nMax Heap output : ");
        while (!maxheap.isEmpty()) {
            System.out.print(maxheap.poll() + " ");
        }
    }    
}
