# Subset Sum Problem

## 🔍 Problem Statement
Given an array of positive integers `arr[]` and a value `sum`, determine if there exists a subset of `arr[]` whose sum is exactly equal to `sum`.

---

## 📌 Examples

### Example 1
**Input:**  
arr = [3, 34, 4, 12, 5, 2]  
sum = 9  

**Output:**  
true  

**Explanation:**  
Subset {4, 3, 2} sums to 9.

---

### Example 2
**Input:**  
arr = [3, 34, 4, 12, 5, 2]  
sum = 30  

**Output:**  
false  

**Explanation:**  
No subset sums to 30.

---

### Example 3
**Input:**  
arr = [1, 2, 3]  
sum = 6  

**Output:**  
true  

**Explanation:**  
The entire array sums to 6.

---

## 🎯 Constraints
- 1 ≤ arr.size() ≤ 200
- 1 ≤ arr[i] ≤ 200
- 1 ≤ sum ≤ 10⁴

---

## 🛠️ Approach
We use **Dynamic Programming (DP)** to solve this problem efficiently.

### Steps:
1. Initialize a boolean DP array of size `sum + 1`, where `dp[s]` indicates if sum `s` is achievable.
2. Set `dp[0] = true` since sum 0 can always be formed with an empty subset.
3. Iterate through each element in the array:
   - For each sum `j` from `sum` down to the current element value:
     - Update `dp[j]` as `dp[j] || dp[j - current_element]`.
4. At the end, `dp[sum]` will indicate whether the target sum is achievable.

---

## ⏳ Complexity Analysis
- **Time Complexity:** O(n × sum)
- **Space Complexity:** O(sum) (using 1D space optimization)

