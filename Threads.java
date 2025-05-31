// Threads - extends Thread
//         - use Runnable Interface


public class Threads {
    public static void main(String[] args) {
        new Car().start();
        new Bike().start();
    }
}

class Car extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Car is running"+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Bike extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Bike is moving"+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}