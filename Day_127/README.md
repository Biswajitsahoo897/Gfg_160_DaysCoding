# Stickler Thief

## Problem Statement
Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot.  
Given an array, `arr[]` where `arr[i]` represents the amount of money in the i-th house, determine the maximum amount he can loot.

---

## Examples

### Example 1:
**Input:**  
`arr[] = [6, 5, 5, 7, 4]`  
**Output:**  
`15`  
**Explanation:**  
Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6 + 5 + 4 = 15.

---

### Example 2:
**Input:**  
`arr[] = [1, 5, 3]`  
**Output:**  
`5`  
**Explanation:**  
Loot only 2nd house and get maximum amount of 5.

---

### Example 3:
**Input:**  
`arr[] = [4, 4, 4, 4]`  
**Output:**  
`8`  
**Explanation:**  
The optimal choice is to loot every alternate house. Looting the 1st and 3rd houses, or the 2nd and 4th, both give a maximum total of 4 + 4 = 8.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^4`

---

## Approach

1. **Dynamic Programming (DP):**
   - Use a DP array where `dp[i]` represents the maximum amount that can be looted from the first `i` houses.
   - For each house, decide whether to loot it (and add its value to `dp[i-2]`) or skip it (and take `dp[i-1]`).
   - The recurrence is:  
     `dp[i] = max(arr[i] + dp[i-2], dp[i-1])`
   - Initialize `dp[0] = arr[0]` and `dp[1] = max(arr[0], arr[1])` (if at least two houses).
   - The answer is `dp[n-1]`, where `n` is the number of houses.

2. **Space Optimization:**
   - Since only the last two values are needed,