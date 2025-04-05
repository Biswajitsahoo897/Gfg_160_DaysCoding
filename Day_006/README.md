#Majority Element II
<br>

__Difficulty: MediumAccuracy: 48.1%Submissions: 139K+Points: 4Average Time: 15m__
<br>
_You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array._ 
<br>g

*Note: The answer should be returned in an increasing format.*
<br>

__Examples:__
<br>

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
<br>
Output: [5, 6]
<br>
Explanation: 5 and 6 occur more n/3 times.
<br>
Input: arr[] = [1, 2, 3, 4, 5]
<br>
Output: []
<br>
Explanation: o candidate occur more than n/3 times.
<br>
Constraint:
<br>
1 <= arr.size() <= 106
<br>
-109 <= arr[i] <= 109