# Anagram

## Problem Statement

Given two strings `s1` and `s2` consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not.  
An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, `"act"` and `"tac"` are anagrams of each other.

### Note:
- Both strings `s1` and `s2` are non-empty.
- Strings can only contain lowercase alphabets.

---

## Input Format

- Two strings `s1` and `s2`.

---

## Output Format

- A boolean value (`true` or `false`) indicating whether the strings are anagrams.

---

## Constraints

- `1 ≤ s1.size(), s2.size() ≤ 105`

---

## Examples

### Example 1:
**Input:**  
`s1 = "geeks", s2 = "kseeg"`  
**Output:**  
`true`  
**Explanation:**  
Both strings have the same characters with the same frequency. So, they are anagrams.

---

### Example 2:
**Input:**  
`s1 = "allergy", s2 = "allergic"`  
**Output:**  
`false`  
**Explanation:**  
Characters in both strings are not the same, so they are not anagrams.

---

### Example 3:
**Input:**  
`s1 = "g", s2 = "g"`  
**Output:**  
`true`  
**Explanation:**  
Both strings contain the same character, so they are anagrams.

---

## Notes

To check if two strings are anagrams:
1. Count the frequency of each character in both strings.
2. Compare the frequency counts. If they match, the strings are anagrams.
3. Alternatively, sort both strings and compare them for equality.  
The time complexity of the solution is `O(N)` for frequency counting or `O(N log N)` for sorting.