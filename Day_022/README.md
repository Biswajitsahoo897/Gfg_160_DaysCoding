# H-Index Problem

## Problem Statement
Given an integer array `citations[]`, where `citations[i]` is the number of citations a researcher received for the `i-th` paper, the task is to find the **H-Index**.

The **H-Index** is the largest value such that the researcher has at least `H` papers that have been cited at least `H` times.

---

## Examples

### Example 1:
**Input**:  
`citations[] = [3, 0, 5, 3, 0]`  
**Output**:  
`3`  
**Explanation**:  
There are at least 3 papers (3, 5, 3) with at least 3 citations.

---

### Example 2:
**Input**:  
`citations[] = [5, 1, 2, 4, 1]`  
**Output**:  
`2`  
**Explanation**:  
There are 3 papers (with citation counts of 5, 2, and 4) that have 2 or more citations. However, the H-Index cannot be 3 because there aren't 3 papers with 3 or more citations.

---

### Example 3:
**Input**:  
`citations[] = [0, 0]`  
**Output**:  
`0`  
**Explanation**:  
No paper has at least 1 citation.

---

## Constraints
- `1 ≤ citations.size() ≤ 10^6`
- `0 ≤ citations[i] ≤ 10^6`

---

## Approach
1. **Sort the Array**: Sort the `citations[]` array in descending order.
2. **Iterate and Check**: Iterate through the sorted array and find the largest index `i` such that `citations[i] >= i + 1`.
3. **Return the Result**: The value of `i + 1` at the point where the condition holds is the H-Index.

---

## Complexity
- **Time Complexity**: `O(n log n)` due to sorting.
- **Space Complexity**: `O(1)` if sorting is done in-place.

---

## Tags
- Array
- Sorting
- Medium Difficulty