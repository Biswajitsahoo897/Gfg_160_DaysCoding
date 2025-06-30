# k-th Smallest in BST

## Problem Statement
Given a BST and an integer k, the task is to find the kth smallest element in the BST. If there is no kth smallest element present then return -1.

---

## Examples

### Example 1:
**Input:**  
root = [2, 1, 3], k = 2  
**Output:**  
2  
**Explanation:**  
2 is the 2nd smallest element in the BST.
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid1_1738413633.png" width=50%>

---

### Example 2:
**Input:**  
root = [2, 1, 3], k = 5  
**Output:**  
-1  
**Explanation:**  
There is no 5th smallest element in the BST as the size of BST is 3.
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700236/Web/Other/blobid1_1738413633.png" width=50%>

---

### Example 3:
**Input:**  
root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 3  
**Output:**  
10  
**Explanation:**  
10 is the 3rd smallest element in the BST.
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700498/Web/Other/blobid1_1736918049.jpg" width=50%>

---

## Constraints
- 1 ≤ number of nodes, k ≤ 10^5
- 1 ≤ node->data ≤ 10^5

---