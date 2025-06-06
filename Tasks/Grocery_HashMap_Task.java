import java.util.HashMap;
import java.util.Map;

public class Grocery_HashMap_Task {

    //Use a HashMap to store items and their prices
    // Add 5 items
    // print total cost of all items
    // update the price of any item
    // remove one item

    public static void main(String[] args) {
        HashMap<String,Integer> groceries = new HashMap<>();
        groceries.put("Apple",120);
        groceries.put("Mango",90);
        groceries.put("Banana",60);
        groceries.put("Orange",100);
        groceries.put("Watermelon",50);

        int sum = 0;
        for(Map.Entry<String,Integer> entry : groceries.entrySet()){
            sum += entry.getValue();
        }
        System.out.println("Total cot of all items : "+ sum);

        groceries.put("Apple",150);
        System.out.println("Updated items and costs in groceries : "+groceries);

        groceries.remove("Watermelon");
        System.out.println("After removing watermelon ,the items : "+groceries);
    }
}
