package questions;

import java.util.HashSet;

class conatins_duplicate {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,4};

      boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hash = new HashSet<>();

        for (int x:nums) {
            if (hash.contains(x)) return true;
            hash.add(x);

        }

        return false;
    }
}