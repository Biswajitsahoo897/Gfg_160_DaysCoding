
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
//ignore the aboove code, it is just for the reference of Node class
class Solution {
    int height(Node node) {
        if(node==null) 
            return -1;
        int lheight=height(node.left);
        int rheight=height(node.right);         
        return Math.max(lheight,rheight)+1;
        
    }
}