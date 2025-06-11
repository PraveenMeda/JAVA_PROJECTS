public class LogTime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 7;

        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                System.out.println("Found "+ target+" at index : "+mid);
                return;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(target + " not in array");
    }
}
