import java.util.*;
import java.util.PriorityQueue;
class Node{
        int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    Node mergeKLists(List<Node> arr) {
        PriorityQueue<Node> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.data));
        for(Node head:arr) if (head!=null) pq.add(head);
        Node temp=new Node(0),tail=temp;
        while(!pq.isEmpty()){
            tail.next=pq.poll();
            tail=tail.next;
            if(tail.next!=null) pq.add(tail.next);
        }
        return temp.next;
    }
}