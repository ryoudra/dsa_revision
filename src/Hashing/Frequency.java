package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public ArrayList<Integer> solve(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res= new ArrayList<>();
        Map<Integer, Integer> hm= new HashMap<>();
        for(int x: arr1)
            if(hm.containsKey(x))
                hm.put(x, hm.get(x)+1);
            else
                hm.put(x,1);

        for(int x:arr2){
            res.add(hm.get(x)==null?0:hm.get(x));
        }
        return res;
    }
}
