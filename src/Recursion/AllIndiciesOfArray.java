package Recursion;

import java.util.ArrayList;

public class AllIndiciesOfArray {
    ArrayList<Integer> res= new ArrayList<>();
    public ArrayList<Integer> allIndices(ArrayList<Integer> arr, int target) {
        int n= arr.size();
        int s=0,e=n-1;
        find(arr,s,e,target);
        return res;
    }
    public void find(ArrayList<Integer>arr, int s, int e, int target){
        if(s>e)return ;

        if(arr.get(s)==target)res.add(s);
        find(arr,s+1,e,target);
    }
}
