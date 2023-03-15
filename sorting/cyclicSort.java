package sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        // array 1 se n tak hona cahiye tabhi cyclic sort use hoga
        int[] arr = {2,3,5,6,1,4,9,8,7};
        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int current = arr[i] -1;
            if(arr[i] != arr[current]) {
                swap(arr,i, current);
            }else{
                i++;
            }
        }

    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
