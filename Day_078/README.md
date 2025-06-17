# Solve the Sudoku

## Problem Statement
Given an incomplete Sudoku configuration in terms of a 9x9 2-D integer square matrix, `mat[][]`, the task is to solve the Sudoku. It is guaranteed that the input Sudoku will have exactly one solution.

A sudoku solution must satisfy all of the following rules:
- Each of the digits 1-9 must occur exactly once in each row.
- Each of the digits 1-9 must occur exactly once in each column.
- Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

**Note:** Zeros represent blanks to be filled with numbers 1-9, while non-zero cells are fixed and cannot be changed.



### Example 1:
**Input:**  
mat[][] =

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701375/Web/Other/blobid0_1738306620.png" width=50%>

**Output**

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701375/Web/Other/blobid0_1738306722.png" width=50%>

---

## Constraints
- `mat.size() = 9`
- `mat[i].size() = 9`
- `0 ≤ mat[i][j] ≤ 9`

---