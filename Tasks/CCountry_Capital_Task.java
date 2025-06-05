import java.util.Map;
import java.util.TreeMap;

// Task  6- Country and Capital
// Objective: Use a TreeMap to store country-capital map i.e., store country names as key and their capitals as values.
// Practice with methods like firstKey(), lastKey(), higherKey(), and lowerKey().
// Instructions:
// Create a TreeMap<String, String> named countryCapitalMap.
// Add the following country-capital pairs to the map:
// "India" -> "New Delhi"
// "USA" -> "Washington"
// "Germany" -> "Berlin"
// "Japan" -> "Tokyo"
// "India" -> "Delhi" (observe what happens)

public class CCountry_Capital_Task {
    public static void main(String[] args) {
        TreeMap<String,String> capitals = new TreeMap<>();
        capitals.put("India","New Delhi");
        capitals.put("USA","Washington");
        capitals.put("Germany","Berlin");
        capitals.put("Japan","Tokyo");
        capitals.put("India","Delhi");

        System.out.println("The entries in sorted order by country name are: ");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
