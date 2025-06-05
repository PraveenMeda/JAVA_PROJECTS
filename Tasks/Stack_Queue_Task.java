import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_Task {
    public static void main(String[] args) {
        Stack<String> toys = new Stack<>();
        toys.push("Ball");
        toys.push("Blocks");
        toys.push("Puzzle");
        System.out.println("The toy being played : "+toys.pop());
        System.out.println("The remaining toys in toy box : "+toys);

        Queue<String> kids = new LinkedList<>();
        kids.add("Maya");
        kids.add("Leo");
        kids.add("Nina");
        System.out.println("Serving to first kid : "+kids.poll());
        System.out.println("remaining students after first kid get served : "+kids);
    }
}
