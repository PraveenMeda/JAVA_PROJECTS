package Projects.Tasks;

import java.util.*;



public class List_Games_MostFunFirst {
    public static void main(String[] args) {
        PriorityQueue<String> games = new PriorityQueue<>(Collections.reverseOrder());
        games.add("FreeFire");
        games.add("PUBG");
        games.add("COD");
        games.add("Among Us");
        System.out.println("List of Games : "); 
        while (!games.isEmpty()) {
            System.out.println(games.poll());
        }

        //most fun first

    }
    
}
