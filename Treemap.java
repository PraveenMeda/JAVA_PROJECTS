import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        // treemap is a heart of java collections frameworks and it implements map interface using a red black tree
        // It stores key-values pairs and maintains the keys in sorted order
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"a");
        map.put(3,"c");
        map.put(5,"e");
        map.put(4,"d");
        map.put(2,"b");
        System.out.println(map);
        System.out.println("Size of map : "+map.size());
        System.out.println("Is map has key 5 :"+map.containsKey(5));
        System.out.println("Is map contains f?"+map.containsValue("f"));
        System.out.println("Is map is empty? "+map.isEmpty());
        System.out.println("Total map: "+map.entrySet());
        System.out.println("First Entry:"+map.firstEntry());
        System.out.println("First key : "+map.firstKey());
        System.out.println("3rd value : "+map.get(3));
    }
}
