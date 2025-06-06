import java.util.Scanner;

public class Find_max_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Highest  : "+max);
    }
}
