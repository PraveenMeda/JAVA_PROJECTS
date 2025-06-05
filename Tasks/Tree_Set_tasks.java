import java.util.Collections;
import java.util.TreeSet;

public class Tree_Set_tasks {
    public static void main(String[] args) {
        // store and display unique numbers
        // Add and find values
        //Store student names alphabetically

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(6);
        set.add(7);
        set.add(7);
        set.add(7);
        System.out.println("Unique set : "+ set);

        System.out.println("First value: "+set.getFirst());
        System.out.println("Last value: "+set.getLast());

        TreeSet<String> names = new TreeSet<>();
        names.add("saketh");
        names.add("vamsi");
        names.add("praveen");
        names.add("vishnu");
        names.add("shakeeb");
        System.out.println("Names in alphabetic order : "+names);
        System.out.println("Names in reverse alphabetic order : "+names.reversed());
    }
}
