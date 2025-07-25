# Clone List with Next and Random

## Problem Statement
You are given a special linked list with `n` nodes where each node has two pointers: a `next` pointer that points to the next node of the singly linked list, and a `random` pointer that points to a random node of the linked list.

Construct a copy of this linked list. The copy should consist of the same number of new nodes, where each new node has the value corresponding to its original node. Both the `next` and `random` pointer of the new nodes should point to new nodes in the copied list, such that it also represents the same list state. None of the pointers in the new list should point to nodes in the original list.

Return the head of the copied linked list.

**NOTE:** The original linked list should remain unchanged.

---

## Examples

### Example 1:
**Input:**  
head = `[[1, 3], [3, 3], [5, NULL], [9, 3]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/885813/Web/Other/blobid2_1737541602.jpg" width=50%>

**Output:**  
head = `[[1, 3], [3, 3], [5, NULL], [9, 3]]`  
**Explanation:**  
- Node 1 points to Node 2 as its NEXT and Node 3 as its RANDOM.
- Node 2 points to Node 3 as its NEXT and Node 3 as its RANDOM.
- Node 3 points to Node 4 as its NEXT and NULL as its RANDOM.
- Node 4 points to NULL as its NEXT and Node 3 as its RANDOM.

---

### Example 2:
**Input:**  
head = `[[1, 3], [2, 1], [3, 5], [4, 3], [5, 2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700186/Web/Other/blobid2_1735042710.jpg" width=50%>

**Output:**  
head = `[[1, 3], [2, 1], [3, 5], [4, 3], [5, 2]]`  
**Explanation:**  
- Node 1 points to Node 2 as its NEXT and Node 3 as its RANDOM.
- Node 2 points to Node 3 as its NEXT and Node 1 as its RANDOM.
- Node 3 points to Node 4 as its NEXT and Node 5 as its RANDOM.
- Node 4 points to Node 5 as its NEXT and Node 3 as its RANDOM.
- Node 5 points to NULL as its NEXT and Node 2 as its RANDOM.

---

### Example 3:
**Input:**  
head = `[[7, NULL], [7, NULL]]`  
**Output:**  
head = `[[7, NULL], [7, NULL]]`  
**Explanation:**  
- Node 1 points to Node 2 as its NEXT and NULL as its RANDOM.
- Node 2 points to NULL as its NEXT and NULL as its RANDOM.

---

## Constraints
- `1 ≤ n ≤ 100`
- `0 ≤ node->data ≤ 1000`

---