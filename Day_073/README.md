# Remove Loop in Linked List

## Problem Statement
Given the head of a linked list that may contain a loop. A loop means that the last node of the linked list is connected back to a node in the same list. The task is to remove the loop from the linked list (if it exists).

**Custom Input format:**  
A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.

The generated output will be `true` if there is no loop in the list and other nodes in the list remain unchanged, otherwise, `false`.

---

## Examples

### Example 1:
**Input:**  
head = `1 -> 3 -> 4`, pos = 2  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid0_1718609709.png" width=50%>

**Output:**  
`true`  
**Explanation:**  
A loop is present in the list, and it is removed.

---

### Example 2:
**Input:**  
head = `1 -> 8 -> 3 -> 4`, pos = 0  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid0_1718609876.png" width=50%>

**Output:**  
`true`  
**Explanation:**  
The linked list does not contain any loop.

---

### Example 3:
**Input:**  
head = `1 -> 2 -> 3 -> 4`, pos = 1  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid2_1718609744.png" width=50%>

**Output:**  
`true`  
**Explanation:**  
A loop is present in the list, and it is removed.

---

## Constraints
- `1 ≤ size of linked list ≤ 10^5`

---