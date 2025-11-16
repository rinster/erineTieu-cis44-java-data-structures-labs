package lab11_avl_tree;

class AVLNode {
    int key, height;
    AVLNode left, right;

    // Constructor
    AVLNode(int key, int height, AVLNode left, AVLNode right) {
        this.key = key;
        this.height = height;
        this.left = left;
        this.right = right;
    }
}

public class AVLTree {

    AVLNode root;

    int height(AVLNode N) {
        return (N == null) ? 0 : N.height;
    }

    int max(int a, int b) {
        return Math.max(a, b);
    }

    int getBalance(AVLNode N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + max(height(y.left), height(y.right));
        x.height = 1 + max(height(x.left), height(x.right));

        return x;
    }

    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + max(height(x.left), height(x.right));
        y.height = 1 + max(height(y.left), height(y.right));

        return y;
    }

    AVLNode leftRightRotate(AVLNode z) {
        z.left = leftRotate(z.left);
        return rightRotate(z);
    }

    AVLNode rightLeftRotate(AVLNode y) {
        y.right = rightRotate(y.right);
        return leftRotate(y);
    }

    // Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }

    private AVLNode insert(AVLNode node, int key) {
        if (node == null)
            return new AVLNode(key, 1, null, null);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        if (balance > 1 && key > node.left.key)
            return leftRightRotate(node);

        if (balance < -1 && key < node.right.key)
            return rightLeftRotate(node);

        return node;
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(AVLNode node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(AVLNode node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(AVLNode node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
    }
}
