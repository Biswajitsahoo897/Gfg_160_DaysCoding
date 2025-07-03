# Serialize and Deserialize a Binary Tree

## Problem Statement

Serialization is to store a tree in an array so that it can be later restored and deserialization is reading the tree back from the array.


## Examples

**Example 1:**

Input:  
`root = [1, 2, 3]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700281/Web/Other/blobid4_1739345069.png" width=50%>

Output:  
`[2, 1, 3]` (in-order traversal)

**Example 2:**

Input:  
`root = [10, 20, 30, 40, 60, N, N]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700281/Web/Other/blobid5_1739345069.png" width=50%>

Output:  
`[40, 20, 60, 10, 30]` (in-order traversal)

## Constraints

- 1 ≤ Number of nodes ≤ 10⁴
- 1 ≤ Data of a node ≤ 10⁹
