# Rotate a Linked List

## Problem Statement
Given the head of a singly linked list, your task is to left rotate the linked list `k` times.

---

## Examples

### Example 1:
**Input:**  
head = `10 -> 20 -> 30 -> 40 -> 50`, k = 4  
**Output:**  
`50 -> 10 -> 20 -> 30 -> 40`  
**Explanation:**  
- Rotate 1: `20 -> 30 -> 40 -> 50 -> 10`  
- Rotate 2: `30 -> 40 -> 50 -> 10 -> 20`  
- Rotate 3: `40 -> 50 -> 10 -> 20 -> 30`  
- Rotate 4: `50 -> 10 -> 20 -> 30 -> 40`  

---
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/885669/Web/Other/blobid0_1737098802.webp" width="50%">

### Example 2:
**Input:**  
head = `10 -> 20 -> 30 -> 40`, k = 6  
**Output:**  
`30 -> 40 -> 10 -> 20`  
**Explanation:**  
After 6 left rotations, the list becomes `30 -> 40 -> 10 -> 20`.

---
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/885669/Web/Other/blobid3_1737099041.webp" width="50%">

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `0 ≤ k ≤ 10^9`
- `0 ≤ data of node ≤ 10^9`

---