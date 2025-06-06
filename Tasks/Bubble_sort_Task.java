import java.util.Arrays;

public class Bubble_sort_Task {
    public static void main(String[] args) {
        String[] names = {"Sak","Pra","Vam","Sha"};
        int n = names.length;
        for (int i = 0; i < n; i++) {
            for(int j=1; j<n-i; j++) {
                if (names[j].compareTo(names[j - 1]) < 0) {
                    String temp = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = temp;
                }
            }
        }
        System.out.println("The sorted : "+ Arrays.toString(names));

        int[] num = {5,4,3,2,1};
        int m = num.length;
        for (int i = 0; i < m; i++) {
            for(int j=1; j<m-i; j++) {
                if (num[j] < num[j-1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }
        System.out.println("The sorted : "+ Arrays.toString(num));
    }
}
