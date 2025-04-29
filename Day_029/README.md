# Sorted and Rotated Minimum

## Problem Statement
A sorted array of distinct elements `arr[]` is rotated at some unknown point. The task is to find the minimum element in it.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [5, 6, 1, 2, 3, 4]`  
**Output**:  
`1`  
**Explanation**:  
`1` is the minimum element in the array.

---

### Example 2:
**Input**:  
`arr[] = [3, 1, 2]`  
**Output**:  
`1`  
**Explanation**:  
Here `1` is the minimum element.

---

### Example 3:
**Input**:  
`arr[] = [4, 2, 3]`  
**Output**:  
`2`  
**Explanation**:  
Here `2` is the minimum element.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `1 ≤ arr[i] ≤ 10^9`

---

## Approach
1. **Binary Search**:  
   - Use binary search to find the minimum element in the rotated sorted array.
   - Compare the middle element with the rightmost element to decide which half of the array to search next.
   - Continue until the minimum element is found.

2. **Edge Cases**:  
   - If the array is not rotated, the first element is the minimum.

---

## Complexity
- **Time Complexity**: `O(log n)` (binary search).
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Easy Difficulty