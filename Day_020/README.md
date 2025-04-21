# Strings Rotations of Each Other

## Problem Statement

You are given two strings of equal lengths, `s1` and `s2`. The task is to check if `s2` is a rotated version of the string `s1`.

### Note:
- The characters in the strings are in lowercase.

---

## Input Format

- Two strings `s1` and `s2` of equal lengths.

---

## Output Format

- A boolean value (`true` or `false`) indicating whether `s2` is a rotated version of `s1`.

---

## Constraints

- `1 ≤ s1.size(), s2.size() ≤ 105`

---

## Examples

### Example 1:
**Input:**  
`s1 = "abcd", s2 = "cdab"`  
**Output:**  
`true`  
**Explanation:**  
After 2 right rotations, `s1` will become equal to `s2`.

---

### Example 2:
**Input:**  
`s1 = "aab", s2 = "aba"`  
**Output:**  
`true`  
**Explanation:**  
After 1 left rotation, `s1` will become equal to `s2`.

---

### Example 3:
**Input:**  
`s1 = "abcd", s2 = "acbd"`  
**Output:**  
`false`  
**Explanation:**  
Strings are not rotations of each other.

---

## Notes

To solve this problem:
1. Concatenate `s1` with itself to form a new string `s1s1`.
2. Check if `s2` is a substring of `s1s1`.
3. If `s2` is a substring, then `s2` is a rotated version of `s1`; otherwise, it is not.
4. The time complexity of this approach is `O(N)`, where `N` is the length of the strings.