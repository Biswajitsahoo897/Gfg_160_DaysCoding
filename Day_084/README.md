# Construct Tree from Inorder & Preorder

## Problem Statement
Given two arrays representing the inorder and preorder traversals of a binary tree, construct the tree and return the root node of the constructed tree.

**Note:** The output is written in postorder traversal.

---

## Examples

### Example 1:
**Input:**  
inorder[] = [1, 6, 8, 7], preorder[] = [1, 6, 7, 8]  
**Output:**  
[8, 7, 6, 1]  
**Explanation:**  
The tree will look like this after construction and its postorder traversal is [8, 7, 6, 1].

---

### Example 2:
**Input:**  
inorder[] = [3, 1, 4, 0, 2, 5], preorder[] = [0, 1, 3, 4, 2, 5]  
**Output:**  
[3, 4, 1, 5, 2, 0]  
**Explanation:**  
The tree will look like this after construction and its postorder traversal is [3, 4, 1, 5, 2, 0].

---

### Example 3:
**Input:**  
inorder[] = [2, 5, 4, 1, 3], preorder[] = [1, 4, 5, 2, 3]  
**Output:**  
[2, 5, 4, 3, 1]  
**Explanation:**  
The tree will look like this after construction and its postorder traversal is [2, 5, 4, 3, 1].

---

## Constraints
- 1 ≤ number of nodes ≤ 10^3
- 0 ≤ nodes->data ≤ 10^3