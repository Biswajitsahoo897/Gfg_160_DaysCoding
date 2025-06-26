# Maximum Path Sum from Any Node

## Problem Statement
Given a binary tree, the task is to find the maximum path sum. The path may start and end at any node in the tree.

---

## Examples

### Example 1:
**Input:**  
root[] = [10, 2, 10, 20, 1, N, -25, N, N, N, N, 3, 4]  
**Output:**  
42  
**Explanation:**  
The maximum path sum is represented by the path: 20 → 2 → 10 → 10 (right) → -25 → 3 → 4, but the actual maximum sum path is 20 → 2 → 10 → 10, which sums to 42.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700611/Web/Other/blobid3_1736948585.png" width=50%>

---

### Example 2:
**Input:**  
root[] = [-17, 11, 4, 20, -2, 10]  
**Output:**  
31  
**Explanation:**  
The maximum path sum is represented by the path: 20 → 11 → -17 → 4 → 10, but the actual maximum sum path is 20 → 11, which sums to 31.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700611/Web/Other/blobid1_1736947534.png" width=50%>

---

## Constraints
- 1 ≤ number of nodes ≤ 10^3
- -10^4 ≤ node->data ≤ 10^4

---