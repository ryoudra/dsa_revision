package Array;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSumQueryBeggar {
    public ArrayList<Integer> solve(int totalBeggars, ArrayList<ArrayList<Integer>> arr) {
        int n= arr.size();
        List<Integer> res= new ArrayList<>();

        for(int i=0;i<totalBeggars;i++)
            res.add(0);

        for(int i=0;i<n;i++){
            int l= arr.get(i).get(0);
            int r= arr.get(i).get(1);
            int value= arr.get(i).get(2);

            res.set(l-1, res.get(l-1)+ value);
            if(r!=totalBeggars)
                res.set(r, -value+ res.get(r));
        }

        for(int i=1;i<totalBeggars;i++){
            res.set(i, res.get(i)+ res.get(i-1));
        }
        return (ArrayList)res;
    }
}
