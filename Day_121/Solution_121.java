package Day_121;
import java.util.*;
class Solution {
    public int minCoins(int coins[], int sum) {
        int []dp=new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int c:coins){
            for(int i=c;i<=sum;i++){
                if(dp[i-c]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[i-c]+1);
                }
            }
            
        }
        return dp[sum]==Integer.MAX_VALUE?-1:dp[sum];
    }
}