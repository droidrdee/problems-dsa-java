package questions;
import java.util.*;
import java.lang.String;
public class Valid_Anagram {

    public static void main(String[] args) {
        String s = "rraact", t = "carrat";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashSet ss = new HashSet<>();
        HashSet tt = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            ss.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            tt.add(t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)){
                    count = count + 1;
                }
            }
            if (count == 0) return false;
        }

        return true;

    }
}
