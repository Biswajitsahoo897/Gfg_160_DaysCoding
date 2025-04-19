# Search Pattern (KMP Algorithm)

## Problem Statement

Given two strings, one is a text string `txt` and the other is a pattern string `pat`. The task is to print the indices of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices.  
**Note:** Return an empty list in case of no occurrences of the pattern.

---

## Input Format

- A string `txt` representing the text.
- A string `pat` representing the pattern.

---

## Output Format

- A list of integers representing the starting indices of all occurrences of the pattern in the text.

---

## Constraints

- `1 ≤ txt.size() ≤ 106`
- `1 ≤ pat.size() < txt.size()`
- Both strings consist of lowercase English alphabets.

---

## Examples

### Example 1:
**Input:**  
`txt = "abcab", pat = "ab"`  
**Output:**  
`[0, 3]`  
**Explanation:**  
The string `"ab"` occurs twice in `txt`, one starts at index `0` and the other at index `3`.

---

### Example 2:
**Input:**  
`txt = "abesdu", pat = "edu"`  
**Output:**  
`[]`  
**Explanation:**  
There's no substring `"edu"` present in `txt`.

---

### Example 3:
**Input:**  
`txt = "aabaacaadaabaaba", pat = "aaba"`  
**Output:**  
`[0, 9, 12]`  
**Explanation:**  
The pattern `"aaba"` occurs at indices `0`, `9`, and `12`.

---

## Notes

To solve this problem efficiently:
1. Use the **Knuth-Morris-Pratt (KMP) Algorithm** for pattern searching.
2. Preprocess the pattern to create a **Longest Prefix Suffix (LPS)** array.
3. Use the LPS array to skip unnecessary comparisons in the text.
4. The time complexity of the KMP algorithm is `O(N + M)`, where `N` is the length of the text and `M` is the length of the pattern.