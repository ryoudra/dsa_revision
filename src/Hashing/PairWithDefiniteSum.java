package Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class PairWithDefiniteSum {
    public int solve(int sum, ArrayList<Integer> arr) {
        int n= arr.size();
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<n;i++){
            if(hs.contains(sum-arr.get(i)))
                return 1;

            hs.add(arr.get(i));
        }
        return 0;
    }
}
