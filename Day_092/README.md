# Fixing Two nodes of a BST

## Problem Statement

Given the root of a Binary Search Tree (BST), where exactly two nodes were swapped by mistake, fix the BST by swapping them back. Do not change the structure of the tree.

> **Note:** The input will form a BST except for the two swapped nodes. All changes must be reflected in the original BST.

## Examples

**Example 1:**

Input:  
`root = [10, 5, 8, 2, 20]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid0_1738654776.png" width=50%>

Output:  
`1`  
Explanation: The nodes 20 and 8 were swapped.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid1_1738654776.png" width=50%>

**Example 2:**

Input:  
`root = [5, 10, 20, 2, 8]` 
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid2_1738654931.png" width=50%>

Output:  
`1`  
Explanation: The nodes 10 and 5 were swapped.
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid3_1738654931.png" width=50%>
## Constraints

- 1 ≤ Number of nodes ≤ 10³

## Approach

- Perform an in-order traversal to find the two nodes that are out of order.
- Swap their values to restore the BST property.
- The structure of the tree must not be changed.
