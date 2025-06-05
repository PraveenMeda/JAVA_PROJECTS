import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advanced_Graph {

    public static void main(String[] args) {
        graph g = new graph();
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(1,4);

        g.printGraph();
    }
    static class graph{
        private Map<Integer, List<Integer>> adjlist = new HashMap<>();

        void addEdge(int u, int v){
            adjlist.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
            adjlist.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
        }

        void printGraph(){
            for(int node : adjlist.keySet()){
                System.out.println("Node "+node+" is connected to "+adjlist.get(node));
                for(int neighbor : adjlist.get(node)){
                    System.out.println("Edge between "+node+" and "+neighbor);
                }
                System.out.println();
            }

        }
    }

}
