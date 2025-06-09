// Graph structure : 
// Entrance connects to : Reptile house, Bird Sanctuary, Mammal Zone
// Reptile house connects to : Snake Pit
// Bird Sanctuary connects to : Parrot Pavilion
// Mammal Zone connects to : Lion Den, Elephant Enclosure
// All other has no further zones/connections

import java.util.*;

public class Graph_Structure {
    public static void main(String[] args) {
        Map<String, List<String>> zoo = new HashMap<>();
        zoo.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        zoo.put("Reptile House", Arrays.asList("Snake Pit"));
        zoo.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        zoo.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        zoo.put("Snake Pit", new ArrayList<>());
        zoo.put("Parrot Pavilion", new ArrayList<>());
        zoo.put("Lion Den", new ArrayList<>());
        zoo.put("Elephant Enclosure", new ArrayList<>());

        bfs(zoo, "Entrance");
    }

    public static void bfs(Map<String, List<String>> graph, String start){
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println("Visited : " + current);

            for(String neighbor : graph.get(current)){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
    
}
