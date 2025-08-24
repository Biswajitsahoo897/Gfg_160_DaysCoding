package Day_127;
class Solution {
    public int findMaxSum(int arr[]) {
        int prev1=0,prev2=0;
        for(int ele:arr){
            int temp=Math.max(prev1,prev2+ele);
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
        
    }
}