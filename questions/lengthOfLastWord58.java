package questions;

public class lengthOfLastWord58 {
    public static void main(String[] args) {
        String  s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int len = words.length;


    }
}
