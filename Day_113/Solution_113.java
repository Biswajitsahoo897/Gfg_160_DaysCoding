class Solution {
    public int longestPalinSubseq(String s) {
        int n = s.length();  
        // Create a 2D DP array where dp[i][j] represents
        int[][] dp = new int[n][n];
        // Traverse the string in reverse order to fill the DP table
        for (int i = n - 1; i >= 0; i--) {

            // Every single character is a palindrome of length 1
            dp[i][i] = 1;

            // Check all substrings starting from index i to j
            for (int j = i + 1; j < n; j++) {

                // If characters at both ends match
                if (s.charAt(i) == s.charAt(j)) {
                    // Then they can be part of a palindromic subsequence
                    // So, add 2 to the result of the inner substring s[i+1...j-1]
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    // Otherwise, take the maximum of excluding one character
                    // Either from the start (i+1 to j) or end (i to j-1)
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // The result for the full string s[0...n-1] will be stored here
        return dp[0][n - 1];
    }
}
