# Inorder Traversal

## Problem Statement
Given a Binary Tree, your task is to return its In-Order Traversal.

An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).

**Follow Up:** Try solving this with O(1) auxiliary space.

---

## Examples

### Example 1:
**Input:**  
root[] = [1, 2, 3, 4, 5]  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886461/Web/Other/blobid0_1738561309.png" width=50%>

**Output:**  
[4, 2, 5, 1, 3]  
**Explanation:**  
The in-order traversal of the given binary tree is [4, 2, 5, 1, 3].

---

### Example 2:
**Input:**  
root[] = [8, 1, 5, N, 7, 10, 6, N, 10, 6]  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886461/Web/Other/blobid1_1738561309.png" width=50%>

**Output:**  
[1, 7, 10, 8, 6, 10, 5, 6]  
**Explanation:**  
The in-order traversal of the given binary tree is [1, 7, 10, 8, 6, 10, 5, 6].

---

## Constraints
- 1 ≤ number of nodes ≤ 10^5
- 0 ≤ node->data ≤ 10^5

---