public class Linear_Time {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printAllElement(arr);

    }
    static void printAllElement(int[] arr){
        if(arr.length < 1){
            System.out.println("Array is empty");
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println("The element at index "+i+" is : "+ arr[i]);
        }
    }

}