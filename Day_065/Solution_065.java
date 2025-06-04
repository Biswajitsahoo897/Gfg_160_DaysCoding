package Day_065;
// import java.lang.classfile.components.ClassPrinter.Node;

// import java.util.*;
// import Nodes.*;
class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}
// ignore the above imports along with the code, they are just for reference
//here's the answer
class Solution {
    Node reverseList(Node head) {
        Node prev=null;
        while(head!=null){
            Node temp =head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}