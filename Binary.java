// A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.
// Task : Take a tree with 3 names : "Mom","Dad","You"
// print the root of the tree
// print left and right child of the root
// show how to go from top to bottom(root -> children  )
// count how many nodes are in the tree
// count how many nodes don't have children
// print all names from left to right
// Make a tree and flip left and right children(mirror - it)
// print all paths from root to leaf
// check if the tree is empty or not


class Node {
    String name;
    Node left;
    Node right;

    Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
}

public class Binary {

    // Print root
    public static void printRoot(Node root) {
        if (root != null) {
            System.out.println("Root: " + root.name);
        }
    }

    // Print left and right child of root
    public static void printChildren(Node root) {
        if (root != null) {
            System.out.println("Left child of root: " + (root.left != null ? root.left.name : "null"));
            System.out.println("Right child of root: " + (root.right != null ? root.right.name : "null"));
        }
    }

    // Pre-order traversal (root -> left -> right)
    public static void traverseTopToBottom(Node node) {
        if (node != null) {
            System.out.println(node.name);
            traverseTopToBottom(node.left);
            traverseTopToBottom(node.right);
        }
    }

    // Count total nodes
    public static int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Count leaf nodes (no children)
    public static int countLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    // In-order traversal (left -> root -> right)
    public static void printLeftToRight(Node node) {
        if (node != null) {
            printLeftToRight(node.left);
            System.out.print(node.name + " ");
            printLeftToRight(node.right);
        }
    }

    // Mirror (swap left and right)
    public static Node mirrorTree(Node node) {
        if (node == null) return null;
        Node temp = node.left;
        node.left = mirrorTree(node.right);
        node.right = mirrorTree(temp);
        return node;
    }

    // Print all paths from root to leaf
    public static void printAllPaths(Node node, String path) {
        if (node == null) return;
        path += node.name + " -> ";
        if (node.left == null && node.right == null) {
            System.out.println(path.substring(0, path.length() - 4)); // Remove last arrow
        } else {
            printAllPaths(node.left, path);
            printAllPaths(node.right, path);
        }
    }

    // Check if tree is empty
    public static boolean isEmpty(Node node) {
        return node == null;
    }

    public static void main(String[] args) {
        // Create tree
        Node root = new Node("You");
        root.left = new Node("Mom");
        root.right = new Node("Dad");

        // 1. Print root
        printRoot(root);

        // 2. Print children
        printChildren(root);

        // 3. Traverse from top to bottom
        System.out.println("Top to bottom:");
        traverseTopToBottom(root);

        // 4. Count total nodes
        System.out.println("Total nodes: " + countNodes(root));

        // 5. Count leaf nodes
        System.out.println("Leaf nodes: " + countLeafNodes(root));

        // 6. Print all names from left to right
        System.out.print("Left to right: ");
        printLeftToRight(root);
        System.out.println();

        // 7. Mirror the tree
        mirrorTree(root);
        System.out.print("After mirroring (Left to right): ");
        printLeftToRight(root);
        System.out.println();

        // 8. Print all paths from root to leaf
        System.out.println("Paths from root to leaf:");
        printAllPaths(root, "");

        // 9. Check if the tree is empty
        System.out.println("Is the tree empty? " + (isEmpty(root) ? "Yes" : "No"));
    }
}
