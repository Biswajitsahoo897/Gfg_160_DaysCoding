package Day_088;
import java.util.HashMap;
import java.util.Map;
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
// ignore the above code 
public class Solution_088 {
    Map<Integer,Integer> mp=new HashMap<>();
    int count =0;
    
    void DFS(Node root,int k,int currSum){
        if(root==null)return;
        currSum+=root.data;
        if(mp.containsKey(currSum-k)) count+=mp.get(currSum-k);
        mp.put(currSum,mp.getOrDefault(currSum,0)+1);
        DFS(root.left,k,currSum);
        DFS(root.right,k,currSum);
        mp.put(currSum,mp.get(currSum)-1);
        if(mp.get(currSum)==0) mp.remove(currSum);
    }
    public int sumK(Node root, int k) {
        mp.put(0,1);
        DFS(root,k,0);
        return count;
        
    }
}




