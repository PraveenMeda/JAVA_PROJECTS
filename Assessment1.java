// create a program list of students using scanner class take the input and print list of students and with no duplictaes

package xyz;
import java.util.*;
import java.util.Scanner;

public class Assessment1 {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names of 5 Students");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Name of Student"+i+" : ");
            String name = sc.nextLine();
            students.add(name);
        }

        for(String name : students){
            System.out.println(name);
        }

    }
}
