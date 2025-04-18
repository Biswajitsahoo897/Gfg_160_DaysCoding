# Non Repeating Character

## Problem Statement

Given a string `s` consisting of lowercase English letters, return the first non-repeating character in `s`.  
If there is no non-repeating character, return `'$'`.  
**Note:** When you return `'$'`, the driver code will output `-1`.

---

## Input Format

- A string `s` consisting of lowercase English letters.

---

## Output Format

- A character representing the first non-repeating character in the string, or `'$'` if no such character exists.

---

## Constraints

- `1 ≤ s.size() ≤ 105`

---

## Examples

### Example 1:
**Input:**  
`s = "geeksforgeeks"`  
**Output:**  
`'f'`  
**Explanation:**  
In the given string, `'f'` is the first character that does not repeat.

---

### Example 2:
**Input:**  
`s = "racecar"`  
**Output:**  
`'e'`  
**Explanation:**  
In the given string, `'e'` is the only character that does not repeat.

---

### Example 3:
**Input:**  
`s = "aabbccc"`  
**Output:**  
`-1`  
**Explanation:**  
All the characters in the given string are repeating.

---

## Notes

To solve this problem:
1. Use a frequency map (hash table) to count the occurrences of each character in the string.
2. Traverse the string again to find the first character with a frequency of `1`.
3. If no such character exists, return `'$'`.  
The time complexity of this approach is `O(N)`, where `N` is the length of the string.