import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> phonebook = new LinkedHashMap<>();
        phonebook.put(1,"Praveen");
        phonebook.put(2,"Vamsi");
        phonebook.put(3,"Shakeeb");
        phonebook.put(4,"Vishnu");
        phonebook.put(5,"Saketh");
        phonebook.put(6,"Varun");
        System.out.println(phonebook);

        phonebook.remove(6);

        //update student name
        phonebook.replace(4,"Sai varun");

        //check if a key or values exists
        System.out.println("3354 exists ? "+phonebook.containsKey(3354));
        System.out.println("Praveen exists ? "+phonebook.containsValue("Praveen"));

        //print all keys,values, key-value pairs
        System.out.println("All keys : "+phonebook.keySet());
        System.out.println("All values : "+phonebook.values());
        System.out.println("All key-value pairs : "+phonebook.entrySet());
    }
}
