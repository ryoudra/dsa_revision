package Recursion;

public class FastPower {
    public Long power(int a, int b) {
        if(b==0)return 1L;

        Long v= power(a,b/2);
        return b%2==1?v*v*a:v*v;
    }
}
