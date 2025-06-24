package Day_085;
import java.util.ArrayList;
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
class Solution {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        fun(root,arr);
        return arr;
        
    }
    void fun(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        fun(root.left,arr);
        arr.add(root.data);
        fun(root.right,arr);
    }    
}