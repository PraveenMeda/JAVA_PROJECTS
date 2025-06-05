import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search_Task {
    public static void main(String[] args) {
        String[] names = {"Praveen","Saketh","Shakeeb","Vamsi","Vishnu"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to be searched : ");
        String name = sc.nextLine();

        int result = binary_search(names,name);
        if(result != -1)
            System.out.println(name + " found at index: " + result);
        else
            System.out.println(name + " not found");

    }
    static int binary_search(String[] arr, String target){
        int low = 0;
        int high = arr.length -1 ;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid].equals(target)){
                return mid;
            }else if(arr[mid].compareTo(target) < 0){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

}
