# Maximum Circular Subarray Sum

## Problem Statement

Given an array of integers `arr[]` in a circular fashion, find the maximum subarray sum that can be obtained if we assume the array to be circular.

---

## Input Format

- An integer array `arr[]` of size `N`.

---

## Output Format

- A single integer representing the maximum sum of a circular subarray.

---
## Examples

### Example 1:
**Input:**  
`arr[] = [8, -8, 9, -9, 10, -11, 12]`  
**Output:**  
`22`  
**Explanation:**  
Starting from the last element of the array, i.e., `12`, and moving in a circular fashion, the maximum subarray is `{12, 8, -8, 9, -9, 10}`, which gives a maximum sum of `22`.

---

### Example 2:
**Input:**  
`arr[] = [10, -3, -4, 7, 6, 5, -4, -1]`  
**Output:**  
`23`  
**Explanation:**  
The maximum sum of the circular subarray is `23`. The subarray is `{7, 6, 5, -4, -1, 10}`.

---

### Example 3:
**Input:**  
`arr[] = [-1, 40, -14, 7, 6, 5, -4, -1]`  
**Output:**  
`52`  
**Explanation:**  
The circular subarray `{7, 6, 5, -4, -1, -1, 40}` has the maximum sum, which is `52`.

---

## Notes

This problem can be solved using a combination of **Kadane's Algorithm** for the linear subarray and a modified approach to handle the circular nature of the array. The time complexity of the solution is `O(N)`.