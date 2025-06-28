# Check for BST

## Problem Statement
Given the root of a binary tree, check whether it is a BST or not.

**Note:** BSTs cannot contain duplicate nodes.

A BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

---

## Examples

### Example 1:
**Input:**  
root = [2, 1, 3, N, N, N, 5]  
**Output:**  
true  
**Explanation:**  
The left subtree of every node contains smaller keys and right subtree of every node contains greater keys. Hence, the tree is a BST.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700149/Web/Other/blobid0_1739182093.jpg" width=50%>

---

### Example 2:
**Input:**  
root = [2, N, 7, N, 6, N, 9]  
**Output:**  
false  
**Explanation:**  
Since the node to the right of node with key 7 has lesser key value, hence it is not a valid BST.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700149/Web/Other/blobid2_1739182131.jpg" width=50%>

---

### Example 3:
**Input:**  
root = [10, 5, 20, N, N, 9, 25]  
**Output:**  
false  
**Explanation:**  
The node with key 9 present in the right subtree has lesser key value than root node.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700149/Web/Other/blobid3_1739182159.jpg" width=50%>

---

## Constraints
- 1 ≤ number of nodes ≤ 10^5
- 1 ≤ node->data ≤