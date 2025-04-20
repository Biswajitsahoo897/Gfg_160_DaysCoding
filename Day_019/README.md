# Min Chars to Add for Palindrome

## Problem Statement

Given a string `s`, the task is to find the minimum characters to be added at the front to make the string a palindrome.

### Note:
A palindrome string is a sequence of characters that reads the same forward and backward.

---

## Input Format

- A string `s` consisting of lowercase English letters.

---

## Output Format

- An integer representing the minimum number of characters to be added at the front to make the string a palindrome.

---

## Constraints

- `1 ≤ s.size() ≤ 106`

---

## Examples

### Example 1:
**Input:**  
`s = "abc"`  
**Output:**  
`2`  
**Explanation:**  
Add `'b'` and `'c'` at the front of the string to make it a palindrome: `"cbabc"`.

---

### Example 2:
**Input:**  
`s = "aacecaaaa"`  
**Output:**  
`2`  
**Explanation:**  
Add `2` `'a'`s at the front of the string to make it a palindrome: `"aaaacecaaaa"`.

---

## Notes

To solve this problem efficiently:
1. Use the concept of the **Longest Prefix which is also a Suffix (LPS)** from the **Knuth-Morris-Pratt (KMP) Algorithm**.
2. Construct a temporary string by concatenating the original string `s`, a special character (e.g., `'#'`), and the reverse of `s`.
3. Compute the LPS array for the temporary string.
4. The minimum characters to be added is equal to the length of the original string minus the length of the longest palindromic prefix (given by the last value in the LPS array).
5. The time complexity of this approach is `O(N)`, where `N` is the length of the string.

