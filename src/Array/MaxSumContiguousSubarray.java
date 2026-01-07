package Array;

import java.util.List;

public class MaxSumContiguousSubarray {
    public int maxSubArray(final List<Integer> arr) {
        int n= arr.size();
        int currSum=arr.get(0), res=arr.get(0);

        for(int i=1;i<n;i++){
            currSum= currSum+arr.get(i)>arr.get(i)?currSum+arr.get(i):arr.get(i);
            res= Math.max(currSum, res);
        }
        return res;

    }
}
