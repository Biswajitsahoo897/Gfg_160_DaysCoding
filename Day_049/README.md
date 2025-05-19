# Subarrays with sum K

## Problem Statement
Given an unsorted array of integers, find the number of subarrays having sum exactly equal to a given number `k`.

---

## Examples

### Example 1:
**Input:**  
`arr = [10, 2, -2, -20, 10]`, `k = -10`  
**Output:**  
`3`  
**Explanation:**  
Subarrays: `arr[0...3]`, `arr[1...4]`, `arr[3...4]` have sum exactly equal to `-10`.

---

### Example 2:
**Input:**  
`arr = [9, 4, 20, 3, 10, 5]`, `k = 33`  
**Output:**  
`2`  
**Explanation:**  
Subarrays: `arr[0...2]`, `arr[2...4]` have sum exactly equal to `33`.

---

### Example 3:
**Input:**  
`arr = [1, 3, 5]`, `k = 0`  
**Output:**  
`0`  
**Explanation:**  
No subarray with 0 sum.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `-10^3 ≤ arr[i] ≤ 10^3`
- `-10^7 ≤ k ≤ 10^7`

---