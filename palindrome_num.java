import java.util.Scanner;

public class palindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        while(n > 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        if(num == rev){
            System.out.println(num +" is a palindrome");
        }else{
            System.out.println(num +" is not a palindrome");
        }
    }
}
