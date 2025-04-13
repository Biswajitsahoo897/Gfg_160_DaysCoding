# Smallest Positive Missing Number

## Problem Statement

You are given an integer array `arr[]`. Your task is to find the smallest positive number missing from the array.

### Note:
- Positive numbers start from `1`.
- The array can contain negative integers as well.

---

## Input Format

- An integer array `arr[]` of size `N`.

---

## Output Format

- A single integer representing the smallest positive missing number.

---

## Constraints

- `1 ≤ arr.size() ≤ 106`
- `-106 ≤ arr[i] ≤ 106`

---

## Examples

### Example 1:
**Input:**  
`arr[] = [2, -3, 4, 1, 1, 7]`  
**Output:**  
`3`  
**Explanation:**  
The smallest positive missing number is `3`.

---

### Example 2:
**Input:**  
`arr[] = [5, 3, 2, 5, 1]`  
**Output:**  
`4`  
**Explanation:**  
The smallest positive missing number is `4`.

---

### Example 3:
**Input:**  
`arr[] = [-8, 0, -1, -4, -3]`  
**Output:**  
`1`  
**Explanation:**  
The smallest positive missing number is `1`.

---

## Notes

This problem can be solved efficiently in `O(N)` time using an in-place hashing technique. The idea is to rearrange the array such that each positive integer is placed at its correct index (if possible) and then find the first missing positive number.