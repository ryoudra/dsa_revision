package Recursion;

import java.util.ArrayList;

public class LastIndexRecusrion {
    public int LastIndex(ArrayList<Integer> arr, int target) {
        int n= arr.size();
        return find(arr,target,n-1);
    }
    public int find(ArrayList<Integer> arr, int target, int i){
        if(i<0)return -1;

        if(arr.get(i)== target)return i;
        return find(arr,target,i-1);
    }

}
