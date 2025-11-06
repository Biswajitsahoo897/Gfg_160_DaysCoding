# Find Only Repetitive Element from 1 to n-1

## Problem Statement
Given an array `arr[]` of size `n`, filled with numbers from `1` to `n-1` in random order. The array contains exactly one repetitive element. Your task is to find the repetitive element.

**Note:** It is guaranteed that a repeating element is present in the array.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 3, 2, 3, 4]`  
**Output:**  
`3`  
**Explanation:** The number 3 is the only repeating element.

### Example 2
**Input:**  
`arr[] = [1, 5, 1, 2, 3, 4]`  
**Output:**  
`1`  
**Explanation:** The number 1 is the only repeating element.

### Example 3
**Input:**  
`arr[] = [1, 1]`  
**Output:**  
`1`  
**Explanation:** The array size is 2 and both elements are 1, so 1 is the repeating element.

---

## Constraints
- `2 ≤ arr.size() ≤ 10^5`  
- `1 ≤ arr[i] ≤ n-1`

---

## Approach (brief)
- Use a boolean visited array (size n) and scan the input; the first element seen twice is the answer.  
- Alternatively, use a set/hash to detect the repeated element in O(n) time and O(n) space.
- If constant extra space required, use Floyd's Tortoise and Hare cycle detection by treating indices/values as pointers (works because values range 1..n-1 and exactly one duplicate exists).

---

## Complexity
- Time: O(n)  
- Space: O(n) for visited/set approach, O(1) for Floyd's cycle method

---