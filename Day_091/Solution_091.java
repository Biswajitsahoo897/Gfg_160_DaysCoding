package Day_091;

// Using Hash Set
import java.util.HashSet;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

class Solution_091 {
    boolean dfs(Node root,HashSet<Integer> set,int target){
        if(root==null) return false;
        if(set.contains(target-root.data)) return true;
        set.add(root.data);
        return dfs(root.left,set,target)||dfs(root.right,set,target);
    }
    boolean findTarget(Node root, int target) {
        HashSet<Integer> set=new HashSet<>();
        return dfs(root,set,target);
    }
}