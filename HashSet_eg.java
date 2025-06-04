import java.util.HashSet;
import java.util.Set;

public class HashSet_eg {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        System.out.println("Set values are : "+set);
        System.out.println("Is set is empty ? "+set.isEmpty());
        System.out.println("Is set contains 5 : "+set.contains(5));
        System.out.println("SIze of set : "+set.size());
    }
}
