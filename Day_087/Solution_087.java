package Day_087;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
// ignore the above code
class Solution {
    // Function to return maximum path sum from any node in a tree.
    int DFS(Node node,int[] maxSum){
        if(node==null) return 0;
        
        int left=Math.max(0,DFS(node.left,maxSum));
        int right=Math.max(0,DFS(node.right,maxSum));
        
        int currSum=left+right+node.data;
        maxSum[0]=Math.max(maxSum[0],currSum);
        
        return node.data+Math.max(left,right);
    }
    
    int findMaxSum(Node node) {
        int[] maxSum={Integer.MIN_VALUE};
        DFS(node,maxSum);
        return maxSum[0];
    }
}