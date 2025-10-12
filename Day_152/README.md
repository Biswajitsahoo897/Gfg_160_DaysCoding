# Floyd Warshall Algorithm

## Problem Statement

You are given a weighted directed graph, represented by an adjacency matrix `dist[][]` of size `n x n`. In this matrix, `dist[i][j]` represents the weight of the edge from node `i` to node `j`. If there is no direct edge between two nodes, `dist[i][j]` is set to a large value (i.e., `10^8`) to signify infinity.

The graph may contain negative edge weights, but it is guaranteed that it does not contain any negative weight cycles.

Your task is to find the shortest distance between every pair of nodes `(i, j)` in the graph and update the `dist[][]` matrix in place with these shortest distances.

---

### Examples:

**Example 1:**

**Input:** `dist[][] = [[0, 4, 108, 5, 108], [108, 0, 1, 108, 6], [2, 108, 0, 3, 108], [108, 108, 1, 0, 2], [1, 108, 108, 4, 0]]`

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893245/Web/Other/blobid0_1744701272.jpg" width=50%>

**Output:** `[[0, 4, 5, 5, 7], [3, 0, 1, 4, 6], [2, 6, 0, 3, 5], [3, 7, 1, 0, 2], [1, 5, 5, 4, 0]]`

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893245/Web/Other/blobid1_1744701370.jpg" width=50%>

**Explanation:** Each cell `dist[i][j]` in the output shows the shortest distance from node `i` to node `j`, computed by considering all possible intermediate nodes.

**Example 2:**

**Input:** `dist[][] = [[0, -1, 2], [1, 0, 108], [3, 1, 0]]`

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893245/Web/Other/blobid2_1744701698.jpg" width=50%>

**Output:** `[[0, -1, 2], [1, 0, 3], [2, 1, 0]]`

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893245/Web/Other/blobid3_1744701713.jpg" width=50%>

**Explanation:** 
- The shortest distance from 2 to 0 is 2 (path 2 → 1 → 0).
- The shortest distance from 1 to 2 is 3 (path 1 → 0 → 2).

---

### Constraints:
- `1 ≤ dist.size() ≤ 100`
- `-1000 ≤ dist[i][j] ≤ 1000`
- `dist[i][j]` can be `10^8` to represent infinity.

---

## Approach

The Floyd-Warshall algorithm is a dynamic programming algorithm used to find the shortest paths between all pairs of vertices in a weighted graph. It works by systematically considering each vertex as an intermediate vertex in the paths between all pairs of vertices.

The core idea is to build up the solution iteratively:

1.  **Initialization**:
    *   The input `dist[][]` matrix already represents the direct distances between any two nodes. `dist[i][j]` is the length of the path from `i` to `j` using no intermediate vertices.

2.  **Iterative Improvement**:
    *   We iterate through all vertices `k` from `0` to `n-1` and consider each `k` as a potential intermediate vertex.
    *   For each pair of vertices `(i, j)`, we check if the path from `i` to `j` through `k` is shorter than the currently known shortest path.
    *   The check is performed using the following update rule:
        `dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])`
    *   This means the shortest distance from `i` to `j` is either the direct path or the path that goes from `i` to `k` and then from `k` to `j`.

3.  **Triple Loop Structure**:
    *   This logic is implemented using three nested loops:
        ```
        for k from 0 to n-1:
          for i from 0 to n-1:
            for j from 0 to n-1:
              // Update dist[i][j]
              dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
        ```

4.  **Final Result**:
    *   After the loops complete, the `dist[][]` matrix will be updated in place to contain the shortest distances between every pair of vertices in the graph.
