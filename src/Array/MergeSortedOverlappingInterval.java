package Array;

import java.util.ArrayList;

public class MergeSortedOverlappingInterval {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> arr) {
        int n=arr.size(); //total intervals we have to merge if possible

        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        int currStart= arr.get(0).get(0);
        int currEnd= arr.get(0).get(1);

        for(int i=1;i<n;i++){
            int nextStart= arr.get(i).get(0);
            int nextEnd= arr.get(i).get(1);

            if(nextStart<= currEnd){
                currStart= Math.min(currStart, nextStart);
                currEnd= Math.max(currEnd, nextEnd);
            }else{
                ArrayList<Integer> res1= new ArrayList<>();
                res1.add(currStart);
                res1.add(currEnd);
                res.add(res1);

                currStart= nextStart;
                currEnd= nextEnd;
            }
        }

        ArrayList<Integer> res1= new ArrayList<>();
        res1.add(currStart);
        res1.add(currEnd);
        res.add(res1);

        return res;

    }
}
