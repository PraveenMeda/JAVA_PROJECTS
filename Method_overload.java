

public class Method_overload {
    public static void main(String[] args) {
          Calculator calci = new Calculator();
          int a = calci.add(10,20);
          int b = calci.add(10,20,30);
          int c = calci.add(10,20,30,40);
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);

    }
}

class Calculator{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

}
