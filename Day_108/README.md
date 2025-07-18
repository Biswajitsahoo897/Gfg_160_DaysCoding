# K Sized Subarray Maximum

## Problem Statement
Given an array `arr[]` of integers and an integer `k`, find the maximum value for each contiguous subarray of size `k`.

---

## Examples

### Example 1:
**Input**:  
`arr = [1, 2, 3, 1, 4, 5, 2, 3, 6], k = 3`  
**Output**:  
`[3, 3, 4, 5, 5, 5, 6]`  

---

### Example 2:
**Input**:  
`arr = [8, 5, 10, 7, 9, 4, 15, 12, 90, 13], k = 4`  
**Output**:  
`[10, 10, 10, 15, 15, 90, 90]`  

---

### Example 3:
**Input**:  
`arr = [5, 1, 3, 4, 2, 6], k = 1`  
**Output**:  
`[5, 1, 3, 4, 2, 6]`  

---

## Constraints
- `1 ≤ arr.length ≤ 10^6`  
- `1 ≤ k ≤ arr.length`  
- `0 ≤ arr[i] ≤ 10^9`  

---

## Approach
1. **Use a Deque**:
   - It helps track indices of potential maximums.
   - Remove all indices of elements that are smaller than the current element.

2. **Maintain Window Size**:
   - Remove elements from front if they fall out of the current window.
   - Add current max from the front of the deque to result once window is formed.

3. **Time & Space Complexity**:
   - Time: O(n)
   - Space: O(k) (Deque for storing indices)

---
