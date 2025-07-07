# Find Median in a Stream

## Problem Statement

Given a data stream `arr[]` where integers are read sequentially, determine the median of the elements encountered so far after each new integer is read.

- If the data set has an odd number of elements, the median is the middle one.
- If the data set has an even number of elements, the median is the arithmetic mean of the two middle values.

## Examples

**Example 1:**

Input:  
`arr[] = [5, 15, 1, 3, 2, 8]`  
Output:  
`[5.0, 10.0, 5.0, 4.0, 3.0, 4.0]`  

**Example 2:**

Input:  
`arr[] = [2, 2, 2, 2]`  
Output:  
`[2.0, 2.0, 2.0, 2.0]`  

## Constraints

- 1 ≤ arr.size() ≤ 10⁵
- 1 ≤ x ≤ 10⁶
