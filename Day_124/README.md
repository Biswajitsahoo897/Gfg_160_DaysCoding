# Partition Equal Subset Sum

## Problem Statement
Given an array `arr[]`, determine if it can be partitioned into two subsets such that the sum of elements in both parts is the same.

**Note:** Each element must be in exactly one subset.

---

## Examples

### Example 1:
**Input:**  
`arr = [1, 5, 11, 5]`  
**Output:**  
`true`  
**Explanation:**  
The two parts are `[1, 5, 5]` and `[11]`, both summing to 11.

---

### Example 2:
**Input:**  
`arr = [1, 3, 5]`  
**Output:**  
`false`  
**Explanation:**  
This array can never be partitioned into two such parts.

---

## Constraints
- `1 ≤ arr.size ≤ 100`
- `1 ≤ arr[i] ≤ 200`

---

## Approach

1. **Check Total Sum:**  
   - Calculate the total sum of the array. If it is odd, partitioning into two equal subsets is not possible.

2. **Subset Sum Problem:**  
   - If the total sum is even, check if there exists a subset with sum equal to half of the total sum.
   - Use dynamic programming (DP) to solve the subset sum problem.

3. **DP Solution:**  
   - Use a boolean DP array where `dp[i]` is `True` if a subset sum of `i` is possible.
   - Initialize `dp[0] = True`.
   - For each number in the array, update the DP array from right