# Boolean Parenthesization

## Problem Statement
You are given a boolean expression `s` containing:
- `'T'` &rarr; true
- `'F'` &rarr; false

and the following operators between symbols:
- `&` &rarr; boolean AND
- `|` &rarr; boolean OR
- `^` &rarr; boolean XOR

Count the number of ways we can parenthesize the expression so that the value of the expression evaluates to true.

**Note:** The answer is guaranteed to fit within a 32-bit integer.

---

## Examples

### Example 1:
**Input:**  
`s = "T|T&F^T"`  
**Output:**  
`4`  
**Explanation:**  
The expression evaluates to true in 4 ways:  
- `((T|T)&(F^T))`
- `(T|(T&(F^T)))`
- `(((T|T)&F)^T)`
- `(T|((T&F)^T))`

---

### Example 2:
**Input:**  
`s = "T^F|F"`  
**Output:**  
`2`  
**Explanation:**  
The expression evaluates to true in 2 ways:  
- `((T^F)|F)`
- `(T^(F|F))`

---

## Constraints
- `1 ≤ |s| ≤ 100`

---

## Approach

1. **Dynamic Programming (DP):**
   - Use memoization or a DP table to store the number of ways sub-expressions can evaluate to true or false.
   - For each operator, recursively calculate the number of ways the left and right sub-expressions can be true or false, and combine them according to the operator's logic.

2. **Time Complexity:**
   - O(n³), where n is the length of the expression, due to the recursive splitting at each operator and