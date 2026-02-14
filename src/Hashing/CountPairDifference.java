package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountPairDifference {
    public int solve(ArrayList<Integer> arr, int sum) {
        int n= arr.size();
        Map<Integer,Integer> hm= new HashMap<>();
        long c=0;

        for(int i=0;i<n;i++){

            if(hm.containsKey(arr.get(i)+sum)){
                c+=hm.get(arr.get(i)+sum);
                c%=1000000007; }

            if(hm.containsKey(arr.get(i)-sum)){
                c+=hm.get(arr.get(i)-sum);
                c%=1000000007;
            }


            if(hm.containsKey(arr.get(i)))
                hm.put(arr.get(i), hm.get(arr.get(i))+1 );
            else
                hm.put(arr.get(i),1);
        }
        return (int)c;
    }
}
