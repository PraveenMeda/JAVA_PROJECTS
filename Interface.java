package xyz;
public class Interface {
    public static void main(String[] args) {
        Msg m1 = new Msg();
        m1.print();
    }
}

interface Printable{
    void print();
}

class Msg implements Printable{
    public void print(){
        System.out.println("Hello from interface");
    }
}
