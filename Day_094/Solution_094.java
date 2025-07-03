package Day_094;
import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Tree {
    
    // Serialize the binary tree into a list using preorder traversal
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> serializedList = new ArrayList<>();
        serializePreOrder(root, serializedList);  
        return serializedList;
    }

    //function to perform preorder traversal and serialize the tree
    void serializePreOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            list.add(-1);  // use -1 as a marker for null (no node)
            return;
        }

        list.add(root.data); // Add current node's value
        serializePreOrder(root.left, list);  // Recursively traverse left subtree
        serializePreOrder(root.right, list); // same for right one
    }
    // Deserialize the list back into a binary tree
    public Node deserialize(ArrayList<Integer> list) {
        int[] index = {0};  // Use array to maintain index by reference
        return buildTreeFromList(list, index);
    }

    // Helper function to build tree recursively from list
    Node buildTreeFromList(ArrayList<Integer> list, int[] index) {
        // Base condition: if index is beyond list size or marker found
        if (index[0] >= list.size() || list.get(index[0]) == -1) {
            index[0]++;  // Move index forward
            return null;
        }

        // Create a new node with current value
        Node node = new Node(list.get(index[0]++));        
        // Recursively build left and right subtrees
        node.left = buildTreeFromList(list, index);
        node.right = buildTreeFromList(list, index);
        
        return node;  
    }
}
