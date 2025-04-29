# Search in Rotated Sorted Array

## Problem Statement
Given a sorted and rotated array `arr[]` of distinct elements, the task is to find the index of a target key. Return `-1` if the key is not found.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3`  
**Output**:  
`8`  
**Explanation**:  
`3` is found at index `8`.

---

### Example 2:
**Input**:  
`arr[] = [3, 5, 1, 2], key = 6`  
**Output**:  
`-1`  
**Explanation**:  
There is no element that has value `6`.

---

### Example 3:
**Input**:  
`arr[] = [33, 42, 72, 99], key = 42`  
**Output**:  
`1`  
**Explanation**:  
`42` is found at index `1`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^6`
- `1 ≤ key ≤ 10^6`

---

## Approach
1. **Binary Search**:  
   - Use binary search to find the target key in the rotated sorted array.
   - Determine which half of the array is sorted by comparing the middle element with the leftmost and rightmost elements.
   - Narrow down the search range based on the sorted half and the target key.

2. **Edge Cases**:  
   - If the array is not rotated, perform a standard binary search.

---

## Complexity
- **Time Complexity**: `O(log n)` (binary search).
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Medium Difficulty