public class ConstantTime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // constant time refers access the first element
        // O(1) time complexity
        //System.out.println("First Element : " + arr[0]);
        printFirstElement(arr);
    }
    static void printFirstElement(int[] arr){
        if(arr.length < 1){
            System.out.println("Array is empty");
        }
        System.out.println("The Fisrt Element : "+arr[0]);
    }
}
