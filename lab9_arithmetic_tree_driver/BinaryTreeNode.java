package lab9_arithmetic_tree_driver;

public class BinaryTreeNode {
    String value; // Can be an operator "+" or an operand "3"
    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(String value) {
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    // --- TO BE COMPLETED BY STUDENT ---

    /**
     * Performs a preorder traversal starting from this node.
     * (Visit Parent, then Left, then Right)
     * This should output Prefix notation.
     */
    public void traversePreorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        traversePreorder(root.left);
        traversePreorder(root.right);
    }

    /**
     * Performs an inorder traversal starting from this node.
     * (Visit Left, then Parent, then Right)
     * This should output Infix notation (you can add parentheses for clarity).
     */
    public void traverseInorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        // Visit left subtree first
        traverseInorder(root.left);

        // visit the parent (current node)
        System.out.print(root.value + " ");

        // Then visit right subtree
        traverseInorder(root.right);

    }

    /**
     * Performs a postorder traversal starting from this node.
     * (Visit Left, then Right, then Parent)
     * This should output Postfix (RPN) notation.
     */
    public void traversePostorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        // Visit left subtree first
        traversePostorder(root.left);

        // Then visit right subtree
        traversePostorder(root.right);

        // Finally, visit the parent (current node)
        System.out.print(root.value + " ");
    }
}
