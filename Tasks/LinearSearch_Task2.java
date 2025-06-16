package Tasks;

public class LinearSearch_Task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        System.out.println(linear_search(arr,target));
    }
    public static int linear_search(int[] arr,int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
