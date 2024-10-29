public class BinaryTreeExample {

    // Node class to represent each node in the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class to manage tree structure and traversal
    static class BinaryTree {
        Node root;

        // Constructor to initialize an empty binary tree
        BinaryTree() {
            root = null;
        }

        // Method to insert nodes in a binary tree fashion
        public Node insert(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }

            return root;
        }

        // In-order Traversal (Left, Root, Right)
        public void inorderTraversal(Node root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.print(root.data + " ");
                inorderTraversal(root.right);
            }
        }

        // Pre-order Traversal (Root, Left, Right)
        public void preorderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
        }

        // Post-order Traversal (Left, Right, Root)
        public void postorderTraversal(Node root) {
            if (root != null) {
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                System.out.print(root.data + " ");
            }
        }
    }

    // Main method to test the BinaryTree class
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Construct the following binary tree:
                  5
                 / \
                3   7
               / \   \
              2   4   8
        */

        int[] nodes = {5, 3, 7, 2, 4, 8};
        for (int node : nodes) {
            tree.root = tree.insert(tree.root, node);
        }

        System.out.println("In-order Traversal:");
        tree.inorderTraversal(tree.root);  // Output: 2 3 4 5 7 8

        System.out.println("\nPre-order Traversal:");
        tree.preorderTraversal(tree.root);  // Output: 5 3 2 4 7 8

        System.out.println("\nPost-order Traversal:");
        tree.postorderTraversal(tree.root);  // Output: 2 4 3 8 7 5
    }
}
