# Find the First Node of Loop in Linked List

## Problem Statement
Given a head of the singly linked list. If a loop is present in the list then return the first node of the loop else return -1.

**Custom Input format:**  
A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.

---

## Examples

### Example 1:
**Input:**  
(head with a loop starting at node with value 3) 
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/713150/Web/Other/blobid0_1723112915.png" width=50%> 

**Output:**  
`3`  
**Explanation:**  
There exists a loop in the given linked list and the first node of the loop is 3.

---


### Example 2:
**Input:**  
(head with no loop)  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/713150/Web/Other/blobid1_1723112944.png" width=50%>

**Output:**  
`-1`  
**Explanation:**  
No loop exists in the above linked list. So the output is -1.

---

## Constraints
- `1 ≤ no. of nodes ≤ 10^6`
- `1 ≤ node->data ≤ 10^6`

---