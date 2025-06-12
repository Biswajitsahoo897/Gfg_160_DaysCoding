package Day_073;
class Node
{
    int data;
    Node next;
}
class Solution {
    public static void removeLoop(Node head) {
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null &&(slow=slow.next)!=(fast=fast.next.next));
        if(fast==null||fast.next==null) return;
        for(slow=head;slow!=fast;slow=slow.next,fast=fast.next);
        while(fast.next!=slow)fast=fast.next;
        fast.next=null;
        
    }
}