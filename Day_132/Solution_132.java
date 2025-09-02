package Day_132;
import java.util.*;
class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        Set<String> set=new HashSet<>(Arrays.asList(dictionary));
        int n=s.length(); 
        int m=0; // Initialize 'm' to store the maximum length of a word in the dictionary
        // Find the maximum length of a word in the dictionary
        for(String w:dictionary) {
            m=Math.max(m,w.length());
        }
        // dp[i] will be true if s[0...i-1] can be segmented into dictionary words
        boolean[] dp=new boolean[n+1];
        dp[0]=true; // Base case: an empty string can always be segmented

        // Iterate through the string 's'
        for(int i=0;i<n;i++){
            // If s[0...i-1] cannot be segmented, then no further segmentation from this point is possible
            if(!dp[i]) continue;
            // Try to form new segments by extending from index 'i'
            // 'j' represents the length of the current substring being considered
            for(int j=1;j<=m && i+j<=n;j++){
                // Check if the substring s[i...i+j-1] exists in the dictionary
                if(set.contains(s.substring(i,i+j))){
                    dp[i+j]=true; // If it does, then s[0...i+j-1] can be segmented
                }
            }
        }
        return dp[n]; // The final result is stored in dp[n], indicating if s[0...n-1] can be segmented
    }
}