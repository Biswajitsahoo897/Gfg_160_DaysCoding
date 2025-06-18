# Word Search

## Problem Statement
You are given a two-dimensional `mat[][]` of size `n*m` containing English alphabets and a string `word`. Check if the word exists on the mat. The word can be constructed by using letters from adjacent cells, either horizontally or vertically. The same cell cannot be used more than once.

---

## Examples

### Example 1:
**Input:**  
mat[][] = 

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886266/Web/Other/blobid4_1737981964.png" width=50%>

word = "GEEK"  
**Output:**  
true  
**Explanation:**  
The letter cells which are used to construct the "GEEK" are colored.

---

### Example 2:
**Input:**  
mat[][] = 

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886266/Web/Other/blobid5_1737981964.png" width=50%>

word = "HLO"  
**Output:**  
true  
**Explanation:**  
The word "HLO" can be found by moving vertically down from the first letter 'H'.

---

### Example 3:
**Input:**  
mat[][] = 

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886266/Web/Other/blobid6_1737981964.png" width=50%>

word = "SGE"  
**Output:**  
false  
**Explanation:**  
There is no way to construct the word "SGE" as per the given conditions.

---

## Constraints
* `1 <= n, m <= 50`
* `mat[i][j]` is an English alphabet.
* `1 <= |word| <= 50`, where `|word|` is the length of the string `word`.