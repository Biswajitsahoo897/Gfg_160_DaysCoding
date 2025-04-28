# Number of Occurrences

## Problem Statement
Given a sorted array `arr[]` and a number `target`, you need to find the number of occurrences of `target` in `arr[]`.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2`  
**Output**:  
`4`  
**Explanation**:  
The target `2` occurs 4 times in the given array.

---

### Example 2:
**Input**:  
`arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4`  
**Output**:  
`0`  
**Explanation**:  
The target `4` is not present in the given array.

---

### Example 3:
**Input**:  
`arr[] = [8, 9, 10, 12, 12, 12], target = 12`  
**Output**:  
`3`  
**Explanation**:  
The target `12` occurs 3 times in the given array.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `1 ≤ arr[i] ≤ 10^6`
- `1 ≤ target ≤ 10^6`

---

## Approach
1. **Binary Search**:  
   - Use binary search to find the first occurrence of `target` in the array.
   - Use binary search again to find the last occurrence of `target` in the array.
   - The number of occurrences is `(last occurrence index - first occurrence index + 1)`.

2. **Edge Cases**:  
   - If the `target` is not found in the array, return `0`.

---

## Complexity
- **Time Complexity**: `O(log n)` (binary search).
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Easy Difficulty