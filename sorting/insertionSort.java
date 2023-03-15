package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {

        int[] arr = {6,8,3,2,9,1};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > temp) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }
}
