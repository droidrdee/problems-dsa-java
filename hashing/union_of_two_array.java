package hashing;

import java.util.HashSet;
import java.util.Set;

public class union_of_two_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,2,65,4,65,65,4,6,54,3,55,6};
        int[] brr = {612,22,3,2,3,2,12,3,2,32,32,32,1,36,6,65};

        Set <Integer> set = new HashSet<>();

        for(int x : arr){
            set.add(x);
        }
        for(int x: brr){
            set.add(x);
        }

        System.out.println(set);
        System.out.println(set.size());


    }

}
