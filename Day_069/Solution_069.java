class Solution {
    static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);
        Node temp = new Node(0);
        Node tail = temp;
        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
        }
        Node res = reverse(temp.next);
        while (res != null && res.data == 0 && res.next != null) {
            res = res.next;
        }
        return res;
    }
}