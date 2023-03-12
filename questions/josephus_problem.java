package questions;

public class josephus_problem {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int ans = jos(n,k);
        System.out.println(ans);
    }
    static int jos(int n, int k){
        if(n==1)
            return 1;
        return (jos(n-1,k)+k-1)%n+1;
    }



}
