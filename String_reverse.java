import java.util.Arrays;

public class String_reverse {
    public static void main(String[] args) {
        String name = "praveen";
        int n = name.length();
        String rev = "";
        for(int i=n-1; i>=0; i--){
             rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }

}
