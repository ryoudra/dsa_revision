package Recursion;

import java.util.ArrayList;

public class MaxInArrayUsingRecursion {
    public int getMax(ArrayList<Integer> arr) {
        int n= arr.size();
        return find(0,n,arr);
    }
    public int find(int s, int n, ArrayList<Integer> arr){
        if(s==n-1)return arr.get(s);
        return Math.max(arr.get(s), find(s+1,n,arr));
    }
}
