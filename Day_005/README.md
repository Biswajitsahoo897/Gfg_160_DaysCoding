#Pno_005_Next Permutation
<br>
Difficulty: MediumAccuracy: 40.66%Submissions: 199K+Points: 4Average Time: 20m
<br>
__Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order).__

##Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.
<br>
Examples:
<br>
Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]

__Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.__
Input: arr = [3, 2, 1]
Output: [1, 2, 3]
__Explanation: As arr[] is the last permutation, the next permutation is the lowest one.__
Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
__Explanation: The next permutation of the given array is [3, 4, 5, 1, 2].__
<br>
__Constraints:__
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105
