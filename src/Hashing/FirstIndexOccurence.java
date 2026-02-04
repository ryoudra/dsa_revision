package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstIndexOccurence {
    public int solve(ArrayList<Integer> arr) {
        Map<Integer, Integer> hm= new HashMap<>();
        for(int x: arr)
            if(hm.containsKey(x))
                hm.put(x, hm.get(x)+1);
            else
                hm.put(x,1);

        for(int x:arr)
            if(hm.get(x)>1)return x;

        return -1;
    }
}
