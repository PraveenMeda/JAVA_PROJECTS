package Projects.Tasks;

import java.util.*;

// Make a ToDoList - do urgent task first

public class ToDoList_UrgentTaskFirst {
    public static void main(String[] args) {
        Queue<String> taskQueue = new PriorityQueue<>();
        taskQueue.add("Eat 🍕");
        taskQueue.add("Sleep 😴");
        taskQueue.add("Code 🧑🏻‍💻");

        System.out.println("Urgent Task :");
        System.out.println(taskQueue.poll());

    }
    
}
