package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Count0SubarraySum {
    public int solve(ArrayList<Integer> arr) {
        ArrayList<Long> preffix_sum_arr= new ArrayList<>();
        int n= arr.size();

        preffix_sum_arr.add((long)arr.get(0));
        for(int i=1;i<n;i++)
            preffix_sum_arr.add(preffix_sum_arr.get(i-1)+ arr.get(i));

        Map<Long,Integer> hm= new HashMap<>();
        hm.put(0l,1);

        int res=0;

        for(int i=0;i<n;i++){
            Long val= preffix_sum_arr.get(i);
            if(hm.containsKey(val))
            {
                res+= hm.get(val);
                res%=1000000007;
                hm.put(val,hm.get(val)+1);

            }else{
                hm.put(val,1);
            }
        }
        return res;
    }
}
