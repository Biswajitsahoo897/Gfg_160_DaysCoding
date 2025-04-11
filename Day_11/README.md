# Maximum Product Subarray

## Problem Statement

Given an array `arr[]` that contains positive and negative integers (may contain 0 as well), find the maximum product that can be obtained from a subarray of `arr[]`.

### Note:
It is guaranteed that the output fits in a 32-bit integer.

---

## Input Format

- An integer array `arr[]` of size `N`.

---

## Output Format

- A single integer representing the maximum product of a subarray.

---

## Constraints

- `1 ≤ arr.size() ≤ 106`
- `-10 ≤ arr[i] ≤ 10`

---

## Examples

### Example 1:
**Input:**  
`arr[] = [-2, 6, -3, -10, 0, 2]`  
**Output:**  
`180`  
**Explanation:**  
The subarray with the maximum product is `{6, -3, -10}` with product `6 * (-3) * (-10) = 180`.

---

### Example 2:
**Input:**  
`arr[] = [-1, -3, -10, 0, 6]`  
**Output:**  
`30`  
**Explanation:**  
The subarray with the maximum product is `{-3, -10}` with product `(-3) * (-10) = 30`.

---

### Example 3:
**Input:**  
`arr[] = [2, 3, 4]`  
**Output:**  
`24`  
**Explanation:**  
For an array with all positive elements, the result is the product of all elements.

---

## Notes

This problem can be solved using a dynamic programming approach or by maintaining two variables to track the maximum and minimum product at each step. The time complexity of the solution is `O(N)`.