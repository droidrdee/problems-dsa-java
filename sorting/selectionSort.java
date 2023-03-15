package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {6,8,3,2,9,1,0};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int min = i;

            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }
}

