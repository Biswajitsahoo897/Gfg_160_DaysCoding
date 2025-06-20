// package Day_067;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// ignore the above code, it is just for the reference of Node class
class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node temp = new Node(0), tail = temp;
        while (head1 != null && head2 != null) {
            tail.next = (head1.data <= head2.data) ? head1 : head2;
            if (head1.data <= head2.data)
                head1 = head1.next;
            else
                head2 = head2.next;
            tail = tail.next;
        }
        tail.next = (head1 != null) ? head1 : head2;
        return temp.next;
    }
}