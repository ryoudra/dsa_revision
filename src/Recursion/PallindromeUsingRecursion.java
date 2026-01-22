package Recursion;

public class PallindromeUsingRecursion {
    public int solve(String str) {
        int n= str.length();
        int s=0,e=n-1;
        return find(str,s,e)==true?1:0;
    }
    public boolean find(String str,int s, int e){
        if(s>e)return true;
        return str.charAt(s)==str.charAt(e) && find(str, s+1, e-1);
    }
}
