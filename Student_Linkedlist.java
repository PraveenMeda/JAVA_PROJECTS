// create a program list of students using scanner class take the input and print list of students
package xyz;
import java.util.*;
public class Student_Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names of 5 Students");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Name of Student"+i+" : ");
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println(students);

        for(String name : students){
            System.out.println(name);
        }

    }
}
