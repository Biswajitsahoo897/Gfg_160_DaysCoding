# Bellman-Ford Algorithm

## Problem Statement

Given a weighted directed graph with `V` vertices (numbered from 0 to V-1) and `E` edges, represented by a 2D array `edges[][]`, where `edges[i] = [u, v, w]` represents an edge from node `u` to `v` with weight `w`. You are also given a source vertex `src`.

Your task is to compute the shortest distances from the source to all other vertices.

### Rules:
- If a vertex is unreachable from the source, its distance should be marked as `10^8`.
- If the graph contains a negative weight cycle, you must return an array containing a single element `[-1]` to indicate that shortest paths cannot be reliably computed.

---

### Examples:

**Example 1:**
**Input:** 
`V = 5`
`edges[][] = [[1, 3, 2], [4, 3, -1], [2, 4, 1], [1, 2, 1], [0, 1, 5]]`
`src = 0`

**Output:** `[0, 5, 6, 6, 7]`
**Explanation:** 
- **0 to 1:** The shortest path is `0 → 1` with a distance of 5.
- **0 to 2:** The shortest path is `0 → 1 → 2` with a distance of 6.
- **0 to 3:** The shortest path is `0 → 1 → 2 → 4 → 3` with a distance of 6.
- **0 to 4:** The shortest path is `0 → 1 → 2 → 4` with a distance of 7.

**Example 2:**
**Input:** 
`V = 4`
`edges[][] = [[0, 1, 4], [1, 2, -6], [2, 3, 5], [3, 1, -2]]`
`src = 0`

**Output:** `[-1]`
**Explanation:** The graph contains a negative weight cycle formed by the path `1 → 2 → 3 → 1`. The total weight of this cycle is `-6 + 5 - 2 = -3`, which is negative.

---

### Constraints:
- `1 ≤ V ≤ 100`
- `1 ≤ E = edges.size() ≤ V*(V-1)`
- `-1000 ≤ w ≤ 1000`
- `0 ≤ src < V`

---

## Approach

The Bellman-Ford algorithm is used to find the shortest paths from a single source vertex to all other vertices in a weighted directed graph. It is particularly useful because it can handle graphs with negative edge weights.

1.  **Initialization**:
    *   Create a distance array `dist` of size `V`.
    *   Initialize `dist[src]` to `0` and all other entries to a large value (e.g., `10^8`) to represent infinity.

2.  **Edge Relaxation**:
    *   Repeat the following process `V-1` times:
    *   For each edge `(u, v)` with weight `w` in the graph:
        *   If `dist[u] + w < dist[v]`, it means we have found a shorter path to `v` through `u`.
        *   Update the distance: `dist[v] = dist[u] + w`.
    *   This step is repeated `V-1` times because the longest possible shortest path in a graph with `V` vertices can have at most `V-1` edges.

3.  **Negative Weight Cycle Detection**:
    *   After the `V-1` iterations, perform one final iteration over all edges.
    *   For each edge `(u, v)` with weight `w`:
        *   If `dist[u] + w < dist[v]`, it implies that the path can still be shortened. This is only possible if there is a negative weight cycle in the graph.
        *   If such a condition is met, return an array `[-1]` to indicate the presence of a negative cycle.

4.  **Return Result**:
    *   If the final check for negative cycles passes without any updates, the `dist` array contains the shortest distances from the source.
    *   Return the `dist` array. Any vertex that still has the initial large value is unreachable from the source.