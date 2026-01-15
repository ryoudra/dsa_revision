package Array;

import java.util.ArrayList;

public class MergeIntervalsWhenAnotherIntervalGiven {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> b) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.size();
        int i = 0;

        int bs = b.get(0);
        int be = b.get(1);

        // 1. Add all intervals completely to the left
        while (i < n && arr.get(i).get(1) < bs) {
            res.add(arr.get(i));
            i++;
        }

        //when end of arr and first of b fights , first of arr comes to end of b , if <= merge otherwise in next loop it willlbe handled
        // 2. Merge all overlapping intervals with b
        while (i < n && arr.get(i).get(0) <= be) {//2nd point very important
            bs = Math.min(bs, arr.get(i).get(0));
            be = Math.max(be, arr.get(i).get(1));
            i++;
        }
        //arr[1,2] [10,12] b[3,5]

        int currs= bs, curre= be;
        while(i<n){
            int nexts= arr.get(i).get(0);
            int nexte= arr.get(i).get(1);

            if(nexts <= curre){
                //merger as currs curre nexts nexte, but curre>=nexts So
                currs= Math.min(currs, nexts);
                curre= Math.max(curre, nexte);
            }else{
                ArrayList<Integer> res2= new ArrayList<>();
                res2.add(currs);
                res2.add(curre);
                res.add(res2);
                currs= nexts;
                curre= nexte;
            }
            i+=1;
        }

        ArrayList<Integer> res1= new ArrayList<>();
        res1.add(currs);
        res1.add(curre);
        res.add(res1);

        return res;
    }
}
