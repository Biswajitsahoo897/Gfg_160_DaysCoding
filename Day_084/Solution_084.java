package Day_084;

import java.util.HashMap;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

// avoid the above code
class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            m.put(inorder[i], i);
        int[] idx = new int[1];
        return Build(0, inorder.length - 1, preorder, m, idx);
    }

    static Node Build(int l, int r, int preorder[], HashMap<Integer, Integer> m, int[] idx) {
        if (l > r)
            return null;
        Node root = new Node(preorder[idx[0]++]);
        root.left = Build(l, m.get(root.data) - 1, preorder, m, idx);
        root.right = Build(m.get(root.data) + 1, r, preorder, m, idx);
        return root;
    }
}