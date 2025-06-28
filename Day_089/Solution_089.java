package Day_089;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root,int min,int max){
        if(root==null) return true;
        return (root.data>min && root.data<max&&isBST(root.left,min,root.data)&&isBST(root.right,root.data,max));
    }
    boolean isBST(Node root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}