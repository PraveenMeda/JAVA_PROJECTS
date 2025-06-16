package Tasks;

public class JumpSearch {

    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int jump = (int) Math.sqrt(n);
        int left = 0;
        int right = 0;

        while (right < n && arr[right] < key) {
            left = right;
            right += jump;
        }

        for (int i = left; i <= Math.min(right, n - 1); i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;

        int index = jumpSearch(data, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

