package xyz;
public class Abstract_Eg {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.ATM();
        b.ATM1();
    }
}

abstract class Machine{
    abstract void ATM();
    void ATM1(){
        System.out.println("This is second ATM");
    }
}

class Bank extends Machine{
    void ATM(){
        System.out.println("ATM machine using java");
    }
}