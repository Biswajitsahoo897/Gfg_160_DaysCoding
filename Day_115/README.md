# Palindrome SubStrings

## Problem Statement
Given a string `s`, count all palindromic sub-strings present in the string. The length of the palindromic sub-string must be greater than or equal to 2.

A substring is palindromic if it reads the same forwards and backwards.

---

## Examples

### Example 1:
**Input:**  
`s = "abaab"`  
**Output:**  
`3`  
**Explanation:**  
All palindromic substrings (of length > 1) are: `"aba"`, `"aa"`, `"baab"`.

---

### Example 2:
**Input:**  
`s = "aaa"`  
**Output:**  
`3`  
**Explanation:**  
All palindromic substrings (of length > 1) are: `"aa"`, `"aa"`, `"aaa"`.

---

### Example 3:
**Input:**  
`s = "abbaeae"`  
**Output:**  
`4`  
**Explanation:**  
All palindromic substrings (of length > 1) are: `"bb"`, `"abba"`, `"aea"`, `"eae"`.

---

## Constraints
- `2 ≤ s.size() ≤ 10^3`
- `s` contains only lowercase English characters

---

## Approach

### **Dynamic Programming (DP) (O(N²) Time, O(N²) Space)**

1. We use a **2D boolean DP array** `dp[i][j]` to indicate whether the substring `s[i..j]` is a palindrome.
2. **Base cases**: Every single character is trivially a palindrome (we won't count single-character palindromes as per problem statement).
3. We fill the DP table in a manner that checks if the **characters at both ends** match and if the **inside substring** is also a palindrome.
4. Whenever we find `dp[i][j] = true` and `(j - i + 1) >= 2`, we **increment** our palindrome count.
5. Return the final count of **palindromic substrings** of length >= 2.

### **Algorithm Steps**

1. Create a 2D array `dp[n][n]`, initialized to `false`, where `n` is the length of `s`.
2. Traverse the string **in reverse order** for the starting index `i` (from `n-1` down to `0`).
3. Set `dp[i][i] = true` for all `i` (single-character palindromes, though not counted, are needed to build multi-character palindromes).
4. For each `i`, iterate `j` from `i+1` to `n-1`:
   - If `s[i] == s[j]` and the substring in-between is a palindrome (or `j - i == 1` for adjacent chars), set `dp[i][j] = true`.
   - If `dp[i][j]` is `true`, **increment** the count.
5. The result is the total count of palindromic substrings of length ≥ 2.