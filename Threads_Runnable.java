public class Threads_Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new boat());
        Thread t2 = new Thread(new bus());
        t2.start();
        t1.start();
    }
}

class boat implements Runnable{
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

class bus implements Runnable{
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

