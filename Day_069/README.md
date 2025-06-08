# Add Number Linked Lists

## Problem Statement
Given the head of two singly linked lists `num1` and `num2` representing two non-negative integers. The task is to return the head of the linked list representing the sum of these two numbers.

For example, `num1` represented by the linked list: `1 -> 9 -> 0`, similarly `num2` represented by the linked list: `2 -> 5`. Sum of these two numbers is represented by `2 -> 1 -> 5`.

**Note:** There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

---

## Examples

### Example 1:
**Input:**  
num1 = `4 -> 5`, num2 = `3 -> 4 -> 5`  
**Output:**  
`3 -> 9 -> 0`  
**Explanation:**  
Given numbers are 45 and 345. Their sum is 390.

---
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700043/Web/Other/blobid0_1749213210.webp" width=50%>

### Example 2:
**Input:**  
num1 = `0 -> 0 -> 6 -> 3`, num2 = `0 -> 7`  
**Output:**  
`7 -> 0`  
**Explanation:**  
Given numbers are 63 and 7. Their sum is 70.

---

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700043/Web/Other/blobid1_1749213234.webp" width=50%>

## Constraints
- `1 ≤ size of both linked lists ≤ 10^6`
- `0 ≤ elements of both linked lists ≤ 9`

---