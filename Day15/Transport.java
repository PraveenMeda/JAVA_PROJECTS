package Day15;

// package CRT DAY 15;
// Greedy Algorithm
// It is a algorithm that makes the locally optimal choice at each stage with the hope of finding a global optimum.
// In simple words, it is a algorithm that makes the best choice at each step.
public class Transport {
    String name;
    int time;
    int cost;
    public Transport(String name, int time, int cost) {
        this.name = name;
        this.time = time;
        this.cost = cost;
    }

    public static void main(String[] args){
        Transport []options = {
                new Transport("Train", 10, 1500),
                new Transport("Bus", 25, 500),
                new Transport("Car", 15, 650),
                new Transport("Plane", 1, 1000),
        };
        Transport best = options[0];
        for (int i = 0; i < options.length; i++) {
            if (options[i].time < best.time) {
                best = options[i];
            }
        }
        System.out.println("Best option to reach fast GOA ");
        System.out.println(best.name + " - Time : " + best.time + "Hours, Cost , " + best.cost + " Rupees");
    }

}
