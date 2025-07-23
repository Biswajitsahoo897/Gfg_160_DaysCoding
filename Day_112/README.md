#  Longest Common Subsequence

Given two strings `s1` and `s2`, return the **length** of their **Longest Common Subsequence (LCS)**.  
A subsequence maintains the order of characters but may skip some.

##  Problem Statement

> A **subsequence** is a sequence derived by deleting some or no characters without changing the order.  
> Return the **length** of the longest common subsequence of two strings.  
> If none exists, return `0`.

---

##  Examples

###  Example 1
- **Input:** `s1 = "ABCDGH"`, `s2 = "AEDFHR"`
- **Output:** `3`
- **Explanation:** LCS = `"ADH"`

###  Example 2
- **Input:** `s1 = "ABC"`, `s2 = "AC"`
- **Output:** `2`
- **Explanation:** LCS = `"AC"`

###  Example 3
- **Input:** `s1 = "XYZW"`, `s2 = "XYWZ"`
- **Output:** `3`
- **Explanation:** LCS = `"XYZ"` or `"XYW"`

---

##  Constraints

- `1 <= s1.length, s2.length <= 10^3`
- Strings contain **only uppercase English letters**.


