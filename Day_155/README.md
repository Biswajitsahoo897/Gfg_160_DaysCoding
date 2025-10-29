# Maximum XOR of Two Numbers in an Array

## Problem Statement
Given an array `arr[]` of non-negative integers of size `n`, find the maximum possible XOR between any two numbers present in the array.

---

## Examples

### Example 1
**Input:**  
`arr[] = [25, 10, 2, 8, 5, 3]`  
**Output:**  
`28`  
**Explanation:** `5 ^ 25 = 28`.

### Example 2
**Input:**  
`arr[] = [1, 2, 3, 4, 5, 6, 7]`  
**Output:**  
`7`  
**Explanation:** `1 ^ 6 = 7`.

---

## Constraints
- `2 ≤ arr.size() ≤ 5 * 10^4`  
- `1 ≤ arr[i] ≤ 10^6`

---

## Approach (brief)
- Use a binary trie (prefix tree of bits) to insert numbers and for each number traverse the trie preferring the opposite bit to maximize XOR.
- Alternatively, use a bitwise greedy method: iterate from the highest bit to the lowest, keep all prefixes of numbers seen so far in a hash set, and check if the current tentative maximum can be achieved by two prefixes.
- Both approaches run in O(n * B) where B is number of bits (~20 for 10^6).

---

## Complexity
- Time: O(n * B)  
- Space: O(n * B) (for trie) or O(n) (for prefix-set approach)

---