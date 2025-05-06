# K-th Missing Positive Number in a Sorted Array

## Problem Statement
Given a sorted array of distinct positive integers `arr[]`, we need to find the `k-th` positive number that is missing from `arr[]`.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [2, 3, 4, 7, 11], k = 5`  
**Output**:  
`9`  
**Explanation**:  
The missing numbers are `1, 5, 6, 8, 9, 10...`. The `5th` missing number is `9`.

---

### Example 2:
**Input**:  
`arr[] = [1, 2, 3], k = 2`  
**Output**:  
`5`  
**Explanation**:  
The missing numbers are `4, 5, 6...`. The `2nd` missing number is `5`.

---

### Example 3:
**Input**:  
`arr[] = [3, 5, 9, 10, 11, 12], k = 2`  
**Output**:  
`2`  
**Explanation**:  
The missing numbers are `1, 2, 4, 6...`. The `2nd` missing number is `2`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ k ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^6`

---

## Approach
1. **Linear Search**:  
   - Traverse the array and count the missing numbers between consecutive elements.
   - Stop when the count of missing numbers reaches `k`.

2. **Binary Search (Optimized)**:  
   - Use binary search to find the smallest index `i` such that the number of missing numbers before `arr[i]` is greater than or equal to `k`.
   - Calculate the `k-th` missing number using the formula:  
     `k-th missing = arr[i-1] + (k - missing_count_before(arr[i-1]))`.

3. **Edge Cases**:  
   - If `k` is greater than the total number of missing numbers in the array, calculate the missing numbers beyond the last element of the array.

---

## Complexity
- **Time Complexity**:  
  - Linear Search: `O(n)`  
  - Binary Search: `O(log n)`  
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Medium Difficulty