package Tasks;

public class BinarySearch_Task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        System.out.println(binary_search(arr,target));
    }
    public static int binary_search(int[] arr,int target){
        int n = arr.length;
        int low = 0,high=n-1;

        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

}
