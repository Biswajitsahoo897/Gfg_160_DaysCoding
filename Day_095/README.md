# K Largest Elements

**Difficulty:** Medium  
**Accuracy:** 53.56%  

## Problem Statement

Given an array `arr[]` of positive integers and an integer `k`, return the `k` largest elements in decreasing order.

## Examples

**Example 1:**

Input:  
`arr = [12, 5, 787, 1, 23]`, `k = 2`  
Output:  
`[787, 23]`  
Explanation: 1st largest element is 787, 2nd largest is 23.

**Example 2:**

Input:  
`arr = [1, 23, 12, 9, 30, 2, 50]`, `k = 3`  
Output:  
`[50, 30, 23]`  
Explanation: Three largest elements are 50, 30, and 23.

**Example 3:**

Input:  
`arr = [12, 23]`, `k = 1`  
Output:  
`[23]`  
Explanation: 1st largest element is 23.

## Constraints

- 1 ≤ k ≤ arr.size() ≤ 10⁶
- 1 ≤ arr[i] ≤ 10⁶
