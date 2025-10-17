# Minimum Weight Cycle

### Problem Description

Given an undirected, weighted graph with `V` vertices numbered from `0` to `V-1` and `E` edges, represented by a 2D array `edges[][]`, where `edges[i] = [u, v, w]` represents an edge between nodes `u` and `v` with weight `w`.

Your task is to find the minimum weight cycle in this graph.

### Examples

#### Example 1:

**Input:** `V = 5`, `edges[][] = [[0, 1, 2], [1, 2, 2], [1, 3, 1], [1, 4, 1], [0, 4, 3], [2, 3, 4]]`

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893268/Web/Other/blobid6_1744811506.jpg" width=50%>

**Output:** `6`

**Explanation:**

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893268/Web/Other/blobid7_1744811516.jpg" width=50%>

The minimum-weighted cycle is `0 → 1 → 4 → 0` with a total weight of `6` (2 + 1 + 3).

#### Example 2:

**Input:** `V = 5`, `edges[][] = [[0, 1, 3], [1, 2, 2], [0, 4, 1], [1, 4, 2], [1, 3, 1], [3, 4, 2], [2, 3, 3]]`

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893268/Web/Other/blobid4_1744804067.jpg" width=50%>

**Output:** `5`

**Explanation:**

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893268/Web/Other/blobid8_1744811585.jpg" width=50%>

The minimum-weighted cycle is `1 → 3 → 4 → 1` with a total weight of `5` (1 + 2 + 2).


### Constraints

-   `1 ≤ V ≤ 100`
-   `1 ≤ E = edges.size() ≤ 10^3`
-   `1 ≤ edges[i][j] ≤ 100`

---

### Solution Approach

A cycle is formed by an edge `(u, v)` and a path that connects `u` and `v` without using the edge `(u, v)` itself. To find the minimum weight cycle, we can iterate through every edge in the graph and, for each edge, find the shortest path between its two endpoints in the rest of the graph.

The overall algorithm is as follows:

1.  Initialize a variable `min_cycle_weight` to a very large value (infinity).
2.  Iterate through each edge `(u, v)` with weight `w` in the input list of edges.
3.  For each edge `(u, v)`, temporarily "remove" it from the graph.
4.  Find the shortest path distance between `u` and `v` in the graph *without* this edge. Dijkstra's algorithm is suitable for this since edge weights are non-negative.
5.  If a path between `u` and `v` is found (i.e., the distance is not infinity), this path, along with the removed edge `(u, v)`, forms a cycle. The total weight of this cycle is `shortest_path_dist(u, v) + w`.
6.  Update `min_cycle_weight` with the minimum value found so far: `min_cycle_weight = min(min_cycle_weight, shortest_path_dist(u, v) + w)`.
7.  After iterating through all the edges, `min_cycle_weight` will hold the weight of the minimum weight cycle. If no cycle was found, it will remain at its initial large value.

**Dijkstra's Algorithm Implementation Details:**
-   We can use a priority queue (min-heap) to efficiently find the node with the smallest distance to visit next.
-   An adjacency list is a good way to represent the graph for easy traversal.
-   For each edge `(u, v)` we are considering, we run Dijkstra's starting from `u` to find the shortest path to `v`, making sure not to use the direct edge `(u, v)` in the pathfinding process.
