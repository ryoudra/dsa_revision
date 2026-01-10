package Array;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> arr) {
        int n= arr.size();
        //our result array
        ArrayList<Integer> res= new ArrayList<>();

        if(n==1 && arr.get(0)==0)
        {
            res.add(1);
            return res;
        }

        int j=0;
        //clear the 0s from front if there are any
        while(arr.get(j)==0){
            j+=1;
        }
        int remainder= 1;// thing asked to do in question

        for(int i=n-1;i>=j;i--){
            int v= arr.get(i);
            v+= remainder;

            res.add(v%10);
            remainder= v/10;
        }
        if(remainder==1)
            res.add(remainder);

        Collections.reverse(res);
        return res;
    }
}
