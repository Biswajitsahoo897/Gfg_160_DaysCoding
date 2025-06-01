package Day_062;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int sum=0,res=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k) res=i+1;
            if(mp.containsKey(sum-k)){
                res=Math.max(res,(i-mp.get(sum-k)));
            }
            mp.putIfAbsent(sum,i);
        }
        return res;
    }
}