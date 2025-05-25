# Count Distinct Elements in Every Window

## Problem Statement
Given an integer array `arr[]` and a number `k`. Find the count of distinct elements in every window of size `k` in the array.

---

## Examples

### Example 1:
**Input:**  
`arr[] = [1, 2, 1, 3, 4, 2, 3]`, `k = 4`  
**Output:**  
`[3, 4, 4, 3]`  
**Explanation:**  
- Window 1 of size `k = 4` is `1 2 1 3`. Number of distinct elements in this window are 3.  
- Window 2 of size `k = 4` is `2 1 3 4`. Number of distinct elements in this window are 4.  
- Window 3 of size `k = 4` is `1 3 4 2`. Number of distinct elements in this window are 4.  
- Window 4 of size `k = 4` is `3 4 2 3`. Number of distinct elements in this window are 3.

---

### Example 2:
**Input:**  
`arr[] = [4, 1, 1]`, `k = 2`  
**Output:**  
`[2, 1]`  
**Explanation:**  
- Window 1 of size `k = 2` is `4 1`. Number of distinct elements in this window are 2.  
- Window 2 of size `k = 2` is `1 1`. Number of distinct elements in this window is 1.

---

### Example 3:
**Input:**  
`arr[] = [1, 1, 1, 1, 1]`, `k = 3`  
**Output:**  
`[1, 1, 1]`  
**Explanation:**  
All windows have only one distinct element.

---

## Constraints
- `1 ≤ k ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`

---