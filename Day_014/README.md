# Implement Atoi

## Problem Statement

Given a string `s`, the objective is to convert it into an integer format without utilizing any built-in functions. The function should mimic the behavior of the `atoi()` function.

---

## Conversion Rules for Atoi:

1. Skip any leading whitespaces.
2. Check for a sign (`+` or `-`), default to positive if no sign is present.
3. Read the integer by ignoring leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits are present, return `0`.
4. If the integer is greater than `2^31 - 1`, return `2^31 - 1` (`2147483647`).
5. If the integer is smaller than `-2^31`, return `-2^31` (`-2147483648`).

---

## Input Format

- A string `s` containing the input to be converted.

---

## Output Format

- An integer representing the converted value.

---

## Constraints

- The input string `s` can contain leading/trailing whitespaces, signs, digits, and other characters.

---

## Examples

### Example 1:
**Input:**  
`s = "-123"`  
**Output:**  
`-123`  
**Explanation:**  
The string `"-123"` is converted to the integer `-123`.

---

### Example 2:
**Input:**  
`s = "  -"`  
**Output:**  
`0`  
**Explanation:**  
No digits are present, so the returned answer is `0`.

---

### Example 3:
**Input:**  
`s = " 1231231231311133"`  
**Output:**  
`2147483647`  
**Explanation:**  
The converted number exceeds `2^31 - 1`, so the output is clamped to `2147483647`.

---

### Example 4:
**Input:**  
`s = "-999999999999"`  
**Output:**  
`-2147483648`  
**Explanation:**  
The converted number is smaller than `-2^31`, so the output is clamped to `-2147483648`.

---

## Notes

This problem can be solved using a step-by-step approach:
1. Trim leading whitespaces.
2. Parse the sign if present.
3. Extract digits and construct the number.
4. Handle overflow and underflow conditions.
5. Return the final integer.