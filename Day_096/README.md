# K Closest Points to Origin

## Problem Statement

Given an array of points where each point is represented as `points[i] = [xi, yi]` on the X-Y plane and an integer `k`, return the `k` closest points to the origin `(0, 0)`.

The distance between two points on the X-Y plane is the Euclidean distance, defined as:  
`sqrt((x2 - x1)^2 + (y2 - y1)^2)`

> **Note:** You can return the k closest points in any order, driver code will sort them before printing.

## Examples

**Example 1:**

Input:  
`k = 2, points = [[1, 3], [-2, 2], [5, 8], [0, 1]]`  
Output:  
`[[-2, 2], [0, 1]]`  
Explanation: The two closest points to the origin are `[-2, 2]` and `[0, 1]`.

**Example 2:**

Input:  
`k = 1, points = [[2, 4], [-1, -1], [0, 0]]`  
Output:  
`[[0, 0]]`  
Explanation: The closest point to origin is `[0, 0]`.

## Constraints

- 1 ≤ k ≤ points.size() ≤ 10⁵
- -10⁴ ≤ xi, yi ≤ 10⁴

## Approach

- Calculate the squared Euclidean distance for each point (no need to take square root).
- Use a min-heap or sort the points by their distance.
- Return the first `k` points.