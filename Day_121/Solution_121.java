package Day_121;
import java.util.*;
class Solution {
    public int minCoins(int coins[], int sum) {
        int []dp=new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        // Iterate through each coin denomination.
        for(int coin : coins){
            // For each coin, update the dp array for all sums it can contribute to.
            for(int i = coin; i <= sum; i++){
                // If the subproblem dp[i-coin] is solvable (not infinity),
                // then we can potentially form sum 'i' by adding the current coin.
                if(dp[i - coin] != Integer.MAX_VALUE){
                    // Update dp[i] with the minimum of its current value and the value of forming (i-coin) + 1.
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
            
        }
        return dp[sum]==Integer.MAX_VALUE?-1:dp[sum];
        // if no sum found return -1 ,otherwise return the sum
    }
}