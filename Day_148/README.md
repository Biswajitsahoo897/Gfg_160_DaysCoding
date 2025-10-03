# Flood Fill Algorithm  

## Problem Statement  
You are given a 2D grid `image[][]` of size `n * m`, where each `image[i][j]` represents the color of a pixel.  
You are also provided a coordinate `(sr, sc)` representing the starting pixel and a `newColor`.  

Your task is to perform a **flood fill** starting from the pixel `(sr, sc)`.  
You must change its color to `newColor` and then change the color of all adjacent pixels that have the same original color.  
Two pixels are considered adjacent if they are connected **horizontally or vertically (4-directionally)**.  

---

## Examples  

### Example 1  
**Input:**  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/705720/Web/Other/blobid0_1744378665.jpg" width=50%>

`image = [[1, 1, 1, 0],
[0, 1, 1, 1],
[1, 0, 1, 1]],
sr = 1, sc = 2, newColor = 2 ` 
**Output:**  
`[[2, 2, 2, 0],
[0, 2, 2, 2],
[1, 0, 2, 2]]`

**Explanation:**  
The fill starts at `(1, 2)`, which has an original color of `1`.  
The algorithm then recursively finds all 4-directionally connected pixels with the color `1` and changes them to the newColor `2`.  

---

### Example 2  
**Input:**  
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/705720/Web/Other/blobid1_1744378699.jpg" width=50%>

`image = [[1, 1, 1],
[1, 1, 0],
[1, 0, 1]],
sr = 1, sc = 1, newColor = 2`

**Output:**  
`
[[2, 2, 2],
[2, 2, 0],
[2, 0, 1]]`

**Explanation:**  
From the center of the image `(1, 1)`, all pixels connected by a path of the same color (`1`) as the starting pixel are colored with the newColor (`2`).  
The pixel at `(2, 2)` is not colored because it is not 4-directionally connected to the filled area.  

---

## Constraints  
- `1 ≤ n, m ≤ 500`  
- `0 ≤ image[i][j], newColor ≤ 10`  
- `0 ≤ sr < n`  
- `0 ≤ sc < m`  

---

## Approach  

### Traversal Strategy  
The problem can be modeled as finding all **reachable nodes in a graph** from a starting node,  
where nodes are pixels and edges connect adjacent pixels of the same color.  

### Depth-First Search (DFS)  
- A recursive DFS approach is a natural fit.  
- Start a recursive function from the source pixel `(sr, sc)`.  
- In each call:  
  - Check for **boundary conditions**.  
  - Ensure the current pixel's color is the same as the original source color.  
  - If valid:  
    - Change the pixel's color to `newColor`.  
    - Make recursive calls for its four neighbors (**up, down, left, right**).  

### Time & Space Complexity  
- **Time Complexity:** `O(N × M)`, where `N` and `M` are the dimensions of the image, as each pixel is visited at most once.  
- **Space Complexity:** `O(N × M)` in the worst case for the recursion call stack.  

