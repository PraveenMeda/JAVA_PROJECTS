package New;
import java.util.*;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vamsi");
		names.add("Sak");
		names.add(null);
		names.add("Vishnu");
		System.out.println(names);
		System.out.println(names.get(2)); //Used to retrieve the values
		names.set(0, "Vamsi krishna"); //Set a value based on the index 
		System.out.println(names);
		System.out.println(names.remove(3)); 
		System.out.println(names);
	}
}
