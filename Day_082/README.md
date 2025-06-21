# Diameter of a Binary Tree

## Problem Statement
Given a binary tree, the diameter (also known as the width) is defined as the number of edges on the longest path between two leaf nodes in the tree. This path may or may not pass through the root. Your task is to find the diameter of the tree.

---

## Examples

### Example 1:
**Input:**  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/897090/Web/Other/blobid0_1748677796.png" width=50%>

root[] = [1, 2, 3]  
**Output:**  
2  
**Explanation:**  
The longest path has 2 edges (node 2 -> node 1 -> node 3).

---

### Example 2:
**Input:**  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/897090/Web/Other/blobid2_1748677797.png" width=50%>

root[] = [5, 8, 6, 3, 7, 9]  
**Output:**  
4  
**Explanation:**  
The longest path has 4 edges (node 3 -> node 8 -> node 5 -> node 6 -> node 9).

---

## Constraints
-1 ≤ number of nodes ≤ 105
-0 ≤ node->data ≤ 105