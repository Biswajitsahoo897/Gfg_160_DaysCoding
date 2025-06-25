# Tree Boundary Traversal

## Problem Statement
Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order:

- **Left Boundary:** All the nodes on the path from the root to the leftmost leaf node. Prefer the left child over the right child when traversing. Do not include leaf nodes in this section.
- **Leaf Nodes:** All leaf nodes, in left-to-right order, that are not part of the left or right boundary.
- **Reverse Right Boundary:** All the nodes on the path from the rightmost leaf node to the root, traversed in reverse order. Prefer the right child over the left child when traversing. Do not include the root in this section if it was already included in the left boundary.

**Note:** If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary.

---

## Examples

### Example 1:
**Input:**  
root[] = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]  
**Output:**  
[1, 2, 4, 8, 9, 6, 7, 3]  
**Explanation:**  
Boundary traversal includes left boundary, leaf nodes, and right boundary in reverse.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700204/Web/Other/blobid6_1749213679.webp" width=50%>

---

### Example 2:
**Input:**  
root[] = [1, 2, N, 4, 9, 6, 5, N, 3, N, N, N, N, 7, 8]  
**Output:**  
[1, 2, 4, 6, 5, 7, 8]  
**Explanation:**  
As the root doesn't have a right subtree, the right boundary is not included in the traversal.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700204/Web/Other/blobid2_1749213505.webp" width=50%>

---

### Example 3:
**Input:**  
root[] = [1, N, 2, N, 3, N, 4, N, N]  
**Output:**  
[1, 4, 3, 2]  
**Explanation:**  
Left boundary: [1] (as there is no left subtree)  
Leaf nodes: [4]  
Right boundary: [3, 2] (in reverse order)  
Final traversal: [1, 4, 3, 2]

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700204/Web/Other/blobid3_1749213560.webp" width=50%>

---

## Constraints
- 1 ≤ number of nodes ≤ 10^5
- 1 ≤ node->data ≤ 10^5

---