package Array;

import java.util.ArrayList;

public class FirstMissingPositive {
    public int firstMissingPositive(ArrayList<Integer> arr) {
        int n = arr.size();

        for(int i=0;i<n;i++){
            if(arr.get(i)<0)
                arr.set(i, Integer.MAX_VALUE);
        }

        //we will make the (element-1) position -ve so that any +ve no we get that.no+1 will be the result
        for(int i=0;i<n;i++){
            int value= arr.get(i);
            value=Math.abs(value);//somebody made it negative but maybe its position ie value-1 is still +value
            //so usko negative bnaana hai issliye abs used

            if(value>=1 && value<=n){
                arr.set(value-1, Math.abs(arr.get(value-1))*-1 );//here abs is used because might be duplicate is there
                //so once made -ve phir again it came so +ve it will make issliye abs
            }
        }
        for(int i=0;i<n;i++)
            if(arr.get(i)>0)
                return i+1;

        return n+1;
    }
}
