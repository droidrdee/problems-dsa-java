package searching;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,26,16,5,22,9,10,13,14,15,18,45,20,25,29,30,31,303,40};
        int target = 303;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Element found at index : "+i);
                break;
            }
        }
    }
}
