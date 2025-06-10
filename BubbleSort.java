
import java.util.*;

public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {4,5,3,2,1};
            System.out.println(Arrays.toString(arr));
        }
        public static int[] bubble_sort(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n-i; j++) {
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
            return arr;
        }
}
