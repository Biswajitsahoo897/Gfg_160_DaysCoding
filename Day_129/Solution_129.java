package Day_129;
class Solution {
    public int countWays(String digits) {
        if (digits.charAt(0) == '0') return 0;
        int prev2 = 1, prev1 = 1;
        for (int i = 1; i < digits.length(); i++) {
            int curr = (digits.charAt(i) != '0') ? prev1 : 0;
            if (digits.charAt(i - 1) != '0' && Integer.parseInt(digits.substring(i - 1, i + 1)) <= 26)
                curr += prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}