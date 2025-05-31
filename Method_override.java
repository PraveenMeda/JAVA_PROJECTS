public class Method_override {
    public static void main(String[] args) {
        child c = new child();
        c.property();
        parent p = new parent();
        p.property();
    }
}
class parent{
    void property(){
        System.out.println("My property is for my child");
    }
}

class child extends parent{
    void property(){
        System.out.println("My parent property is my property");
    }
}
