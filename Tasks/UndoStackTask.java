import java.util.Stack;

public class UndoStackTask {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Write");
        stack.push("Delete");
        stack.push("Insert");

        System.out.println("The last action performed : "+stack.peek());

    }
}
