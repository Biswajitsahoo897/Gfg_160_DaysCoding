# Missing in Array

## Problem Statement
You are given an array `arr[]` of size `n - 1` that contains distinct integers in the range from 1 to `n` (inclusive). The array represents a permutation of the integers from 1 to `n` with one element missing. Your task is to identify and return the missing element.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 2, 3, 5]`  
**Output:**  
`4`  
**Explanation:** All numbers from 1 to 5 are present except 4.

### Example 2
**Input:**  
`arr[] = [8, 2, 4, 5, 3, 7, 1]`  
**Output:**  
`6`  
**Explanation:** All numbers from 1 to 8 are present except 6.

### Example 3
**Input:**  
`arr[] = [1]`  
**Output:**  
`2`  
**Explanation:** Only 1 is present so the missing element is 2.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`  
- `1 ≤ arr[i] ≤ arr.size() + 1`

---

## Approach (brief)
- Use the sum formula: the sum of numbers from 1 to `n` is `n*(n+1)/2`. Compute `n = arr.size() + 1`, subtract the sum of elements in `arr` from the total to get the missing number.  
- Alternatively, use XOR: XOR all numbers from 1 to `n` and XOR all elements of `arr`; the result is the missing number.

---

## Complexity
- Time: O(n)  
- Space: O(1)

---