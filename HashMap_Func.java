import java.util.HashMap;

public class HashMap_Func {
    public static void main(String[] args) {
        HashMap<Integer,String> stuinfo = new HashMap<>();
        //adding 5 students to student info
        stuinfo.put(3354,"Praveen");
        stuinfo.put(3367,"Saketh");
        stuinfo.put(3369,"Shakeeb");
        stuinfo.put(3384,"Vamsi");
        stuinfo.put(3393,"Vishnu");
        stuinfo.put(3413,"Raghu");

        //Remove an entry using key
        stuinfo.remove(3393);

        //update student name
        stuinfo.replace(3413,"Sai varun");

        //check if a key or values exists
        System.out.println("3354 exists ? "+stuinfo.containsKey(3354));
        System.out.println("Praveen exists ? "+stuinfo.containsValue("Praveen"));

        //print all keys,values, key-value pairs
        System.out.println("All keys : "+stuinfo.keySet());
        System.out.println("All values : "+stuinfo.values());
        System.out.println("All key-value pairs : "+stuinfo.entrySet());
    }
}
