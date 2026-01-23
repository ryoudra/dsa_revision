package Recursion;

public class MagicNumberSum1 {
    public int solve(int num) {
        if(num<=9){
            return num==1?1:0;
        }
        return solve(sum(num));
    }
    public int sum(int n){
        if(n==0)return 0;
        return n%10+sum(n/10);
    }
}
