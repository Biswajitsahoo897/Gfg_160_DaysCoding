# Pair Sum in BST

## Problem Statement

Given a Binary Search Tree (BST) and a target, check whether there's a pair of nodes in the BST with values summing up to the target.

## Examples

**Example 1:**

Input:  
`root = [7, 3, 8, 2, 4, N, 9]`, `target = 12`  
Output:  
`True`  
Explanation: Nodes 8 and 4 add up to 12.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240821183540/bst.webp" width=50%>

**Example 2:**

Input:  
`root = [9, 5, 10, 2, 6, N, 12]`, `target = 23`  
Output:  
`False`  
Explanation: No such pair exists.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240821184007/bst-3.webp" width=50%>

## Constraints

- 1 ≤ Number of Nodes ≤ 10⁵
- 1 ≤ target ≤ 10⁶