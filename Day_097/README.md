# Merge K Sorted Linked Lists

## Problem Statement

Given an array `arr[]` of `n` sorted linked lists of different sizes, merge them into a single sorted linked list and return the head of the merged linked list.

## Examples

**Example 1:**

Input:  
`arr[] = [1 -> 2 -> 3, 4 -> 5, 5 -> 6, 7 -> 8]`  
Output:  
`1 -> 2 -> 3 -> 4 -> 5 -> 5 -> 6 -> 7 -> 8`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700265/Web/Other/blobid0_1737094930.png" width=50%>

**Example 2:**

Input:  
`arr[] = [1 -> 3, 8, 4 -> 5 -> 6]`  
Output:  
`1 -> 3 -> 4 -> 5 -> 6 -> 8`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700265/Web/Other/blobid1_1722513386.png" width=50%>

## Constraints
- 1 ≤ total number of nodes ≤ 10⁵
- 1 ≤ node->data ≤ 10³
