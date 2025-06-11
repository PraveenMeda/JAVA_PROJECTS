package DAY12;

public class Fibo_Recur {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }
       
    }
    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    
}
