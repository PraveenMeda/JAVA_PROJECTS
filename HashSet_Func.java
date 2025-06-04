import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet_Func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<5; i++){
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            set.add(name);
        }

        set.add("Praveen");
        System.out.println("is Praveen exists ? "+ set.contains("Praveen"));
        System.out.println("Hash set :"+ set);

        //converting HashSet to ArrayList
        ArrayList<String> arr = new ArrayList<>(set);
        System.out.println("Array : "+arr);

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }


    }
}
