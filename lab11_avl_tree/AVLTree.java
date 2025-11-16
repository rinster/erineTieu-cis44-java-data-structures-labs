package lab11_avl_tree;

// TODO: Implement the AVLNode class
class AVLNode {
    int key, height;
    AVLNode left, right;

    // Constructor
    AVLNode(int key) {
        // TODO: Initialize key, height, left, and right
    }
}

public class AVLTree {

    AVLNode root;

    // TODO: Return height of a node
    int height(AVLNode N) {
        return 0; // placeholder
    }

    // TODO: Return maximum of two integers
    int max(int a, int b) {
        return 0; // placeholder
    }

    // TODO: Compute balance factor
    int getBalance(AVLNode N) {
        return 0; // placeholder
    }

    // TODO: Right rotation
    AVLNode rightRotate(AVLNode y) {
        return null; // placeholder
    }

    // TODO: Left rotation
    AVLNode leftRotate(AVLNode x) {
        return null; // placeholder
    }

    // TODO: Left-Right rotation
    AVLNode leftRightRotate(AVLNode z) {
        return null; // placeholder
    }

    // TODO: Right-Left rotation
    AVLNode rightLeftRotate(AVLNode y) {
        return null; // placeholder
    }

    // Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }

    // TODO: Recursive insertion with rebalancing
    private AVLNode insert(AVLNode node, int key) {
        return null; // placeholder
    }

    // TODO: Traversal methods
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(AVLNode node) {
        // placeholder
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(AVLNode node) {
        // placeholder
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(AVLNode node) {
        // placeholder
    }
}
