import java.util.*;

public class Queue_Eg{
    public static void main(String[] args) {
        // Queue is also a linear data structure and it follows FIFO
        Queue<String> que = new LinkedList<>();
        que.add("Praveen");
        que.add("Saketh");
        que.add("Vamsi");
        que.add("Vishnu");
        System.out.println("Students : "+que);

        String name = que.poll(); // it returns null when queue is empty
        System.out.println("First Student : "+name);
        System.out.println("Students except Praveen : "+que);
        //System.out.println("Next removed name:"+que.remove()); // remove throw exception when queue is empty
        System.out.println("topperr of AIML : "+ que.peek());
        System.out.println("Is sak in the queue : "+que.contains("Saketh"));

    }
}