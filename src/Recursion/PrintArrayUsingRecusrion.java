package Recursion;

import java.util.ArrayList;

public class PrintArrayUsingRecusrion {
    public void PrintArray(ArrayList<Integer> arr) {
        int n=arr.size();
        print (0,n,arr);
        System.out.println();
    }
    public void print (int start, int end, ArrayList<Integer> arr){
        if(start==end)return ;

        System.out.print(arr.get(start)+" ");
        print(start+1,end, arr);
    }
}
