# Unique Number II

## Problem Statement
Given an array `arr[]` containing `2*n + 2` positive numbers, out of which `2*n` numbers appear in pairs while exactly two numbers occur only once and are distinct. Find those two unique numbers and return them in increasing order.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 2, 3, 2, 1, 4]`  
**Output:**  
`[3, 4]`  
**Explanation:** 3 and 4 occur exactly once.

### Example 2
**Input:**  
`arr[] = [2, 1, 3, 2]`  
**Output:**  
`[1, 3]`  
**Explanation:** 1 and 3 occur exactly once.

### Example 3
**Input:**  
`arr[] = [2, 1, 3, 3]`  
**Output:**  
`[1, 2]`  
**Explanation:** 1 and 2 occur exactly once.

---

## Constraints
- `2 ≤ arr.size() ≤ 10^6`  
- `1 ≤ arr[i] ≤ 5 * 10^6`  
- `arr.size()` is even

---

## Approach (brief)
1. XOR all elements to get `xor = x ^ y` where `x` and `y` are the two unique numbers.  
2. Find a set bit (rightmost set bit) in `xor` to partition numbers into two groups: those with that bit set and those without.  
3. XOR numbers in each group separately to obtain `x` and `y`.  
4. Return the two numbers in increasing order.

This uses bitwise properties to avoid extra memory and runs in linear time.

---

## Complexity
- Time: O(n)  
- Space: O(1)

---