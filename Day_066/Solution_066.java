class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}
// ignore the above imports along with the code, they are just for reference that it won't show any error
class Solution {
  public Node rotate(Node head, int k) {
    // if the list is empty, has one node, or k is 0, return head
    if (head == null || head.next == null || k == 0) return head;
    int len = 1;
    Node tail = head;
    while (tail.next != null) {
      tail = tail.next;
      len++;
    }
    
    k %= len;
    if (k == 0) return head;
    Node newTail = head;
    for (int i = 1; i < k; i++) {
      newTail = newTail.next;
    }
    Node newHead = newTail.next;
    newTail.next = null;
    tail.next = head;
    return newHead;
  }
}