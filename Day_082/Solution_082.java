package Day_082;
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
//ignore the above code ,they are just for the reference
class Solution {
    int[] solve(Node root) {
        if (root == null) return new int[]{0, 0}; // {height, diameter}
        int[] a = solve(root.left), b = solve(root.right);
        int h = 1 + Math.max(a[0], b[0]);
        int d = Math.max(Math.max(a[1], b[1]), a[0] + b[0]);
        return new int[]{h, d};
    }
    int diameter(Node root) {
        return solve(root)[1];
    }
}