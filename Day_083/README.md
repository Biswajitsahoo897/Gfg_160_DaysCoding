# Mirror Tree

## Problem Statement
Given a binary tree, convert the binary tree to its Mirror tree.

Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

---

## Examples

### Example 1:
**Input:**  
root[] = [1, 2, 3, N, N, 4]  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700155/Web/Other/blobid0_1736926809.png" width=50%>

**Output:**  
[1, 3, 2, N, 4]  
**Explanation:**  
In the inverted tree, every non-leaf node has its left and right child interchanged.

---

### Example 2:
**Input:**  
root[] = [1, 2, 3, 4, 5]  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700155/Web/Other/blobid1_1736926809.png" width=50%>

**Output:**  
[1, 3, 2, N, N, 5, 4]  
**Explanation:**  
In the inverted tree, every non-leaf node has its left and right child interchanged.

---

## Constraints
- 1 ≤ number of nodes ≤ 10^5
- 1 ≤ node->data ≤ 10^5

---