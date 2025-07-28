# Edit Distance

## Problem Statement
Given two strings `s1` and `s2`, return the minimum number of operations required to convert `s1` to `s2`.

The possible operations are:
- Insert a character at any position of the string.
- Remove any character from the string.
- Replace any character from the string with any other character.

---

## Examples

### Example 1:
**Input:**  
`s1 = "geek"`, `s2 = "gesek"`  
**Output:**  
`1`  
**Explanation:**  
One operation is required, inserting 's' between two 'e' in `s1`.

---

### Example 2:
**Input:**  
`s1 = "gfg"`, `s2 = "gfg"`  
**Output:**  
`0`  
**Explanation:**  
Both strings are the same.

---

### Example 3:
**Input:**  
`s1 = "abcd"`, `s2 = "bcfe"`  
**Output:**  
`3`  
**Explanation:**  
We can convert `s1` into `s2` by removing ‘a’, replacing ‘d’ with ‘f’, and inserting ‘e’ at the end.

---

## Constraints
- `1 ≤ s1.length(), s2.length() ≤ 10^3`
- Both strings are in lowercase.

---

## Approach

1. **Dynamic Programming (DP)**:
   - Use a 2D DP table where `dp[i][j]` represents the minimum number of operations to convert the first `i` characters of `s1` to the first `j` characters of `s2`.
   - If the current characters match, no operation is needed.
   - Otherwise, consider insert, remove, and replace operations.
   - The answer is `dp[len(s1)][len(s2)]`.

2. **Time Complexity**:
   - O(n * m), where n and m are the lengths of the two strings.