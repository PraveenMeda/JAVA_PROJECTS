import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        //tree set is a part of java collection framework and it represents a set of collections that uses a red black tree
        // it is a type of binary search tree
        //Tree set directly sorts the elements
        TreeSet<Integer> num = new TreeSet<>();
        num.add(50);
        num.add(20);
        num.add(40);
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(60);
        System.out.println(num);
        System.out.println(num.first());
        System.out.println(num.higher(30));
        System.out.println("Is Tree set empty?"+num.isEmpty());
        System.out.println(num.last());
    }
}
