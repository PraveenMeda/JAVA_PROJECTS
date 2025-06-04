import java.util.LinkedList;
import java.util.List;

public class LinkedList_eg {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        System.out.println("List using linkedliist : "+ll);
        System.out.println("First element : "+ll.getFirst());
        ll.remove(2);
        ll.set(1,5);
        System.out.println("After removing 2nd element and inserted 5 at index 1 ");
        System.out.println("The linkedlist is : "+ ll);
        System.out.println("Size of array : "+ll.size());
        System.out.println("First element : "+ll.getFirst());
        System.out.println("Last element : "+ll.getLast());


    }
}
