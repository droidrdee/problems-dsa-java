package searching;

import java.util.Arrays;

public class find_the_duplicate_number {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,3,5,8,6,9,10,7};
        System.out.println(find(nums));

    }

    static int find(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i= 0; i < nums.length; i++) {
            if(nums[i] == nums[i+1]){
                break;
            }
        }
        return nums[i];
    }
}
