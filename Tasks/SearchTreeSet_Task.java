import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class SearchTreeSet_Task {
    public static void main(String[] args) {
        TreeSet<String> products = new TreeSet<>();
        products.add("Key board");
        products.add("Mouse");
        products.add("Monitor");
        products.add("CPU");
        products.add("Webcam");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a product name : ");
        String product = sc.nextLine();

        if(products.contains(product)){
            System.out.println("Product already in the products list");
        }else{
            products.add(product);
            System.out.println("Product added successfully!");
        }
        System.out.println(products);
    }
}
