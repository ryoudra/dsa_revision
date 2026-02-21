package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurence {
    public ArrayList<Integer> searchRange(final List<Integer> arr, int num) {
        int n= arr.size();
        int first=-1;
        int last=-1;

        ArrayList<Integer> res=new ArrayList<>();
        int l=0,h=n-1;

        while(l<=h){
            int m= l+(h-l)/2;
            if(arr.get(m).equals(num))
            {
                last=m;
                l=m+1;
            }
            else if(arr.get(m)>num)
                h=m-1;
            else
                l=m+1;
        }

        l=0;
        h=n-1;
        while(l<=h){
            int m= l+(h-l)/2;
            if(arr.get(m).equals(num))
            {
                first=m;
                h=m-1;
            }
            else if(arr.get(m)>num)
                h=m-1;
            else
                l=m+1;
        }

        res.add(first);
        res.add(last);

        return res;
    }
}
