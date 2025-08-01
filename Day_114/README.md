# Longest Palindrome in a String

## Problem Statement
Given a string `s`, your task is to find the longest palindromic substring within `s`.

A substring is a contiguous sequence of characters within a string, defined as `s[i...j]` where `0 ≤ i ≤ j < len(s)`.

A palindrome is a string that reads the same forward and backward. More formally, `s` is a palindrome if `reverse(s) == s`.

**Note:** If there are multiple palindromic substrings with the same length, return the first occurrence of the longest palindromic substring from left to right.

---

## Examples

### Example 1:
**Input:**  
`s = "forgeeksskeegfor"`  
**Output:**  
`"geeksskeeg"`  
**Explanation:**  
There are several possible palindromic substrings like `"kssk"`, `"ss"`, `"eeksskee"` etc. But the substring `"geeksskeeg"` is the longest among all.

---

### Example 2:
**Input:**  
`s = "Geeks"`  
**Output:**  
`"ee"`  
**Explanation:**  
`"ee"` is the longest palindromic substring of `"Geeks"`.

---

### Example 3:
**Input:**  
`s = "abc"`  
**Output:**  
`"a"`  
**Explanation:**  
`"a"`, `"b"` and `"c"` are longest palindromic substrings of same length. So, the first occurrence is returned.

---

## Constraints
- `1 ≤ s.size() ≤ 10^3`
- `s` consists of only lowercase English letters.

---

## Approach

1. **Expand Around Center**:
   - For each character and each gap between characters, expand outwards to check for palindromes.
   - Track the longest palindrome found.

2. **Time Complexity**:
   - O(n^2), where n is the length of the string.

---