import java.util.TreeSet;

// Task 3 - Library Book IDs
// Objective: Use TreeSet methods like first(), last(), higher(), and lower().
// Instructions:
// Store the following Book IDs: 5002, 4998, 5005, 4999, 5001.
// Find and print:
// The first Book ID.
// The last Book ID.
// The Book ID immediately higher than 4999.
// The Book ID immediately lower than 5005.

public class LibraryBookIDs_Task {
    public static void main(String[] args) {
        TreeSet<Integer> lib = new TreeSet<>();
        lib.add(5002);
        lib.add(4998);
        lib.add(5005);
        lib.add(4999);
        lib.add(5001);

        System.out.println("First book Id in library: "+lib.first());
        System.out.println("Last book Id in library: "+lib.last());
        System.out.println("the ID just higher than 4999 is : "+lib.higher(4999));
        System.out.println("the ID just lower than 5005 is : "+lib.lower(5005));
    }
}
