# Lowest Common Ancestor in a BST

## Problem Statement

Given a Binary Search Tree (BST) with all unique values and two nodes `n1` and `n2` (`n1 != n2`), find the Lowest Common Ancestor (LCA) of the given two nodes in the BST.

LCA between two nodes `n1` and `n2` is defined as the lowest node that has both `n1` and `n2` as descendants (where we allow a node to be a descendant of itself).

## Examples

**Example 1:**

Input:  
`root = [5, 4, 6, 3, N, N, 7, N, N, N, 8]`, `n1 = 7`, `n2 = 8`  
Output:  
`7`  
Explanation: 7 is the closest node to both 7 and 8, which is also an ancestor of both the nodes.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid0_1738413634.png" width=50%>

**Example 2:**

Input:  
`root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14]`, `n1 = 8`, `n2 = 14`  
Output:  
`8`  
Explanation: 8 is the closest node to both 8 and 14, which is also an ancestor of both the nodes.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid1_1739265251.png" width=50%>

**Example 3:**

Input:  
`root = [2, 1, 3]`, `n1 = 1`, `n2 = 3`  
Output:  
`2`  
Explanation: 2 is the closest node to both 1 and 3, which is also an ancestor of both the nodes.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid1_1738413633.png" width=50%>

## Constraints
- 1 ≤ number of nodes ≤ 10⁵
- 1 ≤ node->data ≤ 10⁵
- 1 ≤ n1, n2 ≤ 10⁵

## Approach

- Start from the root and Recusively traverse the BST.
- If both `n1` and `n2` are smaller than root, LCA lies in the left subtree.
- If both are greater, LCA lies in the right subtree.
- Otherwise, the current node is the LCA.
