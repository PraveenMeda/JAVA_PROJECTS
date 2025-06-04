import java.util.*;

public class ArrayList_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        // Add elements dynamiclly
        System.out.print("Enter no. of students : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++){
            System.out.print("Enter name of student "+i+":");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("Names of 5 students : "+names);
        // Remove an element by index and by value
        names.remove(2);
        names.add("John");
        System.out.println(names);
        names.remove("John");
        System.out.println("After removing John : "+ names);

        //sorting the List
        Collections.sort(names);
        System.out.println("Sorted list "+ names);

        //Reversing the list
        Collections.reverse(names);
        System.out.println("Reversed list : "+names);
        System.out.println("Reversed list : "+names.reversed());

    }
}
