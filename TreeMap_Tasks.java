import java.util.TreeMap;

public class TreeMap_Tasks {
    public static void main(String[] args) {
        //store student marks
        //search in treemap
        //make simple phone book

        TreeMap<String,Integer> marks = new TreeMap<>();
        marks.put("Praveen",101);
        marks.put("Vamsi",100);
        marks.put("Shakeeb",111);
        marks.put("Saketh",111);
        System.out.println(marks);

        System.out.println("Is any one got 111 marks : "+marks.containsValue(111));
        System.out.println("Is any one named Praveen : "+marks.containsKey("Praveen"));

        TreeMap<String,Integer> phonebook = new TreeMap<>();
        phonebook.put("Praveen",7386900);
        phonebook.put("Vamsi",78965412);
        phonebook.put("Saketh",85520145);
        phonebook.put("Shakeeb",45698745);
        System.out.println(phonebook);
    }
}
