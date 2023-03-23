package searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,10,13,15,18,20,25,30,33,40};
        int target = 15;

        int ans = binary(arr, target);
        System.out.println("Element found at index : "+ans);
    }

    static int binary(int[] arr, int t) {
        int s = 0;
        int e = arr.length;

        int mid = s + (e - s)/2;

        while(s < e) {
            mid = s + (e-s)/2;

            if(arr[mid] == t) {
                return mid;
            }
            else if(arr[mid] > t) {
                s = mid + 1;
            }
            else {
                e = mid -1;
            }
        }
        return -1;
    }
}
