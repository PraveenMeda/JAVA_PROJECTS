package Projects.Tasks;

import java.util.*;

// Find top2 samllest numbers in a list using queue
public class Find_top2_using_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.add(5);
        list.add(2);
        list.add(8);

        System.out.println("Top 2 Smallest Numbers : ");
        for (int i = 0; i < 2; i++) {
            System.out.print(list.poll() + " ");
        }
    }
}
