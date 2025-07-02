package Day_093;
class Node
{
    int data;
    Node left, right;
    public Node(int d)
    {
      data = d;
      left = right = null;
    }
}

public class Solution_093 {
    Node LCA(Node root, Node n1, Node n2) {
        if(root==null) return null;

        // if n1 & n2 are smaller than root then go to left 
        if(root.data>n1.data && root.data>n2.data)
        return LCA(root.left,n1,n2);

        // if n1 & n2 are greater than root then go to right
        if(root.data<n1.data && root.data<n2.data)
            return LCA(root.right,n1,n2);

        return root;
    }
}

