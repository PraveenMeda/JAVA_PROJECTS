//Task : Imagine you're using a car just to drive it,not build or repair it
// List the features of a car that are necessary only for driving it
// Do not include the internal parts parts like engine, wiring,wiring,fuel injection System


public class Abstraction_Task {
    public static void main(String[] args) {
        abstractBody car = new abstractBody();
        car.start();
        car.stop();
        car.features();
    }
}
abstract class Car{
    abstract void start();
    abstract void stop();
    abstract void features();
}

class abstractBody extends Car{
    void start(){
        System.out.println("Use keys to start");
        System.out.println("Car is staring");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    void features() {
        System.out.println("Car has 4 wheels");
        System.out.println("car is in red color");
        System.out.println("This car is electric");
        System.out.println("This car doesn't need diesel/petrol");
    }
}
