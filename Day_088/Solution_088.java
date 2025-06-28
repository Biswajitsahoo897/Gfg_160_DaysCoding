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
    Map<Integer, Integer> mp = new HashMap<>();
    int count = 0;

    void DFS(Node root, int k, int currSum) {
        if (root == null)
            return;
        currSum += root.data;
        if (mp.containsKey(currSum - k))
            count += mp.get(currSum - k);
        mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);
        DFS(root.left, k, currSum);
        DFS(root.right, k, currSum);
        mp.put(currSum, mp.get(currSum) - 1);
        if (mp.get(currSum) == 0)
            mp.remove(currSum);
    }

    int sumK(Node root, int k) {
        mp = new HashMap<>(); 
        count = 0;
        mp.put(0, 1);
        DFS(root, k, 0);
        return count;

    }

    public static void main(String[] args) {
        Solution_088 s = new Solution_088();
        // Create a sample tree:
        // 8
        // / \
        // 4 5
        // / \ \
        // 3 2 2
        // / \ \
        // 3 -2 1
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.right = new Node(2);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);

        int k = 7;

        System.out.println(s.sumK(root, k));
    }
}
