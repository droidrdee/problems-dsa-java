package hashing;
import java.util.*;
public class demo {
    public static void main(String[] args) {

        HashSet <Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(6);
        set.add(9);

        System.out.println(set);

        // functions of hashset
        System.out.println(set.contains(3));
        System.out.println(set.remove(6));
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());



        /// another way to implement hashSet

        Set <Integer> s = new HashSet<>();
        s.add(5);
        s.add(55);
        System.out.println(s);

    }
}
