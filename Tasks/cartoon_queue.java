package Projects.Tasks;

// Make a cartoon style "task queue" - Eat 🍕 > Sleep 😴 > Code 🧑🏻‍💻

import java.util.*;

public class cartoon_queue {
    public static void main(String[] args) {

        Queue<String> taskQueue = new PriorityQueue<>();
        taskQueue.add("Eat 🍕");
        taskQueue.add("Sleep 😴");
        taskQueue.add("Code 🧑🏻‍💻");

        System.out.println("Cartoon Task Queue:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
