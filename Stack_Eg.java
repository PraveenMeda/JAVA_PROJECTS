import java.util.Stack;

// A Stack is a linear data structure that stores items in Last In First Out(LIFO) order
public class Stack_Eg {
    public static void main(String[] args) {
        Stack<Integer> plates = new Stack<>();
        plates.add(101);
        plates.add(102);
        plates.add(103);
        plates.add(105);
        plates.add(104);
        System.out.println("The cleaned plates are : "+plates);
        System.out.println("Total no. of plates cleaned : "+plates.size());
        System.out.println("Now two persons are eaten ");
        plates.pop();
        plates.pop();
        System.out.println("After eating,the remaining plates are : "+plates);
    }
}
