package Recursion;

import java.util.ArrayList;

public class FirstIndexRecursion {
    public int find(int i, int n, int b, ArrayList<Integer> arr){
        if(i==n-1 || arr.get(i)==b)
            return arr.get(i)==b?i:-1;

        return find(i+1,n,b,arr);
    }
    public int FirstIndex(ArrayList<Integer> arr, int b) {
        int i=0,n=arr.size();
        return find(i,n,b,arr);
    }

}
