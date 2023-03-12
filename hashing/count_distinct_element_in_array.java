package hashing;

import java.util.HashSet;

public class count_distinct_element_in_array {
    public static void main(String[] args) {

        int[] arr = {5, 10, 12, 16, 10, 12, 5, 16, 26, 22, 10, 5, 12, 16, 16, 12, 12};
        int ans = countDistinct(arr);
        System.out.println("Number of distinct element : "+ans);
    }
    static int countDistinct(int[] a) {
        HashSet <Integer> s = new HashSet<>(a.length);
        for(int element : a){
            s.add(element);
        }
        return s.size();

    }
}
