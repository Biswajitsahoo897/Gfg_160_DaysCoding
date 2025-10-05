# Clone an Undirected Graph
## Problem Statement
-Given a connected undirected graph represented by adjacency list, `adjList[][]` with n nodes, having a distinct label from 0 to n-1, where each `adj[i]` represents the list of vertices connected to vertex i.

-Create a clone of the graph, where each node in the graph contains an integer val and an array (neighbors) of nodes, containing nodes that are adjacent to the current node.
-Your task is to complete the `function cloneGraph( )` which takes a starting node of the graph as input and returns the copy of the given node as a reference to the cloned graph.

## Examples 
### Example 1
**Input**

`n = 4, adjList[][] = [[1, 2], [0, 2], [0, 1, 3], [2]]`

**Output: true**

**Explanation:**

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893038/Web/Other/blobid0_1744464094.jpg" width=50%>

As the cloned graph is identical to the original one the driver code will print true.

### Example 2
**Input:** 
-`n = 3, adjList[][] = [[1, 2], [0], [0]]`
**Output: -true**

**Explanation:**

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/893038/Web/Other/blobid1_1744465861.jpg" width=50%>

-As the cloned graph is identical to the original one the driver code will print true.


**Constraints:**
-`1 ≤ n ≤ 104`
-`0 ≤ no. of edges ≤ 105`
-`0 ≤ adjList[i][j] < n`

---