# Unique Number I

## Problem Statement
Given an unsorted array `arr[]` of positive integers where every number occurs exactly twice except for one number which occurs only once, find and return the number that occurs only once.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 2, 1, 5, 5]`  
**Output:**  
`2`  
**Explanation:** 2 occurs once while other numbers occur twice.

### Example 2
**Input:**  
`arr[] = [2, 30, 2, 15, 20, 30, 15]`  
**Output:**  
`20`  
**Explanation:** 20 occurs once while other numbers occur twice.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^9`

---

## Approach (brief)
- Use the XOR property: x ^ x = 0 and x ^ 0 = x. XOR all elements of the array; numbers that appear twice cancel out, leaving the unique number.
- This yields O(n) time and O(1) extra space.

---

## Complexity
- Time: O(n)  
- Space: O(1)

---