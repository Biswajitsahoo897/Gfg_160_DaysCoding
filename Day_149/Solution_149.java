package Day_149;
import java.util.*;
class Node{
    int val;
    ArrayList<Node> neighbors;
    public Node(){
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val){
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors){
        this.val = val;
        this.neighbors = neighbors;
    }
}
class Solution {
    Node cloneGraph(Node node) {
        if(node==null){
            return null;
            
        }
        Map<Node,Node> m=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        m.put(node,new Node(node.val));
        q.add(node);
        while(!q.isEmpty()){
            for(Node n: q.peek().neighbors){
                if(!m.containsKey(n)){
                    m.put(n,new Node(n.val));
                    q.add(n);
                }
                m.get(q.peek()).neighbors.add(m.get(n));
            }
            q.poll();
        }
        return m.get(node);
    }
}