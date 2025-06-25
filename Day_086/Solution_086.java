package Day_086;
import java.util.ArrayList;
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
class Solution {
    void lb(Node r,ArrayList<Integer> v){
        if(r==null||(r.left==null && r.right==null)) return;
        v.add(r.data);
        lb(r.left!=null?r.left:r.right,v);
    }
    void rb(Node r,ArrayList<Integer> v){
        if(r==null||(r.left==null && r.right==null)) return;
        rb(r.right!=null?r.right:r.left,v);
        v.add(r.data);
    }
    void leaf(Node r,ArrayList<Integer> v){
        if(r==null) return;
        leaf(r.left,v);
        if(r.left==null && r.right==null) v.add(r.data);
        leaf(r.right,v);
    }
    public ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> v=new ArrayList<>();
        if(node==null) return v;
        v.add(node.data);
        lb(node.left,v);
        leaf(node.left,v);
        leaf(node.right,v);
        rb(node.right,v);
        return v;
    }
}