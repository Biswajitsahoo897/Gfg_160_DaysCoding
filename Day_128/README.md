# Stickler Thief II

## Problem Statement
You are given an array `arr[]` which represents houses arranged in a circle, where each house has a certain value. A thief aims to maximize the total stolen value without robbing two adjacent houses.

**Note:** Since the houses are in a circle, the first and last houses are also considered adjacent.

---

## Examples

### Example 1:
**Input:**  
`arr[] = [2, 3, 2]`  
**Output:**  
`3`  
**Explanation:**  
arr[0] and arr[2] can't be robbed because they are adjacent houses. Thus, 3 is the maximum value thief can rob.

---

### Example 2:
**Input:**  
`arr[] = [1, 2, 3, 1]`  
**Output:**  
`4`  
**Explanation:**  
Maximum stolen value: arr[0] + arr[2] = 1 + 3 = 4

---

### Example 3:
**Input:**  
`arr[] = [2, 2, 3, 1, 2]`  
**Output:**  
`5`  
**Explanation:**  
Maximum stolen value: arr[0] + arr[2] = 2 + 3 = 5 or arr[2] + arr[4] = 3 + 2 = 5

---

## Constraints
- `2 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^4`

---

## Approach

1. **Circular House Constraint:**  
   - Since the first and last houses are adjacent, you cannot rob both.
   - The problem reduces to two cases:
     - Rob houses from index 0 to n-2 (exclude last house).
     - Rob houses from index 1 to n-1 (exclude first house).
   - Take the maximum of the two cases.

2. **Dynamic Programming for Each Case:**  
   - Use the standard "House Robber" DP for both cases:
     - For a subarray, use `dp[i] = max(arr[i] + dp[i-2], dp[i-1])`.
   - The answer is the maximum value from both cases.