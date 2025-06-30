package Day_090;
class Node{
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
//Solved using Morris Traversal 
public class Solution_090 {
    public int kthSmallest(Node root, int k) {
        while (root != null) {
            if (root.left == null) {
                if (--k == 0) return root.data;
                root = root.right;
            } else {
                Node pre = root.left;
                while (pre.right != null && pre.right != root) pre = pre.right;
                if (pre.right == null) {
                    pre.right = root;
                    root = root.left;
                } else {
                    pre.right = null;
                    if (--k == 0) return root.data;
                    root = root.right;
                }
            }
        }
        return -1;
    }
}

