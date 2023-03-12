package questions;

public class nxm_marix_rightAndBottom {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int ans = count(n,m);
        System.out.println(ans);

    }
    static int count(int n, int m){
        if (n==1 || m==1)
            return 1;

        return count(n-1,m) + count(n,m-1);
    }
}
