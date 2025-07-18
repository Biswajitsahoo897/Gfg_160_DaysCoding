# Postfix Evaluation

## Problem Statement
You are given an array of strings `arr` that represents a valid arithmetic expression written in Reverse Polish Notation (Postfix Notation). Your task is to evaluate the expression and return an integer representing its value.

- The valid operators are '+', '-', '*', and '/'.
- Each operand is guaranteed to be a valid integer or another expression.
- The division operation between two integers always rounds the result towards zero, discarding any fractional part.
- No division by zero will occur in the input.
- The input is a valid arithmetic expression in Reverse Polish Notation.
- The result of the expression and all intermediate calculations will fit in a 32-bit signed integer.

---

## Examples

### Example 1:
**Input:**  
`arr = ["2", "3", "1", "*", "+", "9", "-"]`  
**Output:**  
`-4`  
**Explanation:**  
If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.

---

### Example 2:
**Input:**  
`arr = ["100", "200", "+", "2", "/", "5", "*", "7", "+"]`  
**Output:**  
`757`  
**Explanation:**  
If the expression is converted into an infix expression, it will be ((100 + 200) / 2) * 5 + 7  = 150 * 5 + 7 = 757.

---

## Constraints

- `1 <= arr.size() <= 10^5`
- `arr[i]` is either an operator: "+", "-", "*", or "/", or an integer in the range [-10^4, 10^4]

---

## Approach

 **Use a Stack**:
   - Traverse the array from left to right.
   - If the element is an operand, push it onto the stack.
   - If the element is an operator, pop the top two operands from the stack, apply the operator, and push the result back onto the stack.
   - At the end, the stack will contain the result.


---