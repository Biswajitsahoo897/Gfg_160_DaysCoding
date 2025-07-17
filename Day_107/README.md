# Decode the String

## Problem Statement
Given an encoded string `s`, decode it. The encoding rule is:

`k[encodedString]`, where the `encodedString` inside the square brackets is being repeated exactly `k` times. The string may have nested encoded patterns.

---

## Examples

### Example 1:
**Input**:  
`s = "1[b]"`  
**Output**:  
`b`  

---

### Example 2:
**Input**:  
`s = "3[b2[ca]]"`  
**Output**:  
`bcacabcacabcaca`  

---

## Constraints
- `1 ≤ |s| ≤ 10⁵`
- `1 ≤ k ≤ 100`
- The output string length will never exceed `10⁵`.

---

## Approach
1. **Use Two Stacks**:
   - One stack for counts (repeats).
   - One stack for string segments.

2. **Traverse the String**:
   - Build repeat number when digits are found.
   - On encountering `[`, push current string to stack and reset.
   - On encountering `]`, pop and repeat segment accordingly.

3. **Efficient Nested Handling**:
   - Properly maintains nested patterns through stacks.

---
