package lab11_avl_tree;

public class AVLTreeDriver {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // --- LL Rotation Test ---
        // Insert in decreasing order to force right rotation
        int[] keys = { 10, 20, 30, 40, 50, 5, 15, 25, 35 };

        for (int key : keys) {
            tree.insert(key);
        }

        System.out.println("After LL rotation:");
        System.out.print("Inorder: ");
        tree.inorder(); // Expected: 10 20 30
        System.out.print("Preorder: ");
        tree.preorder(); // Expected: 20 10 30
        System.out.print("Postorder: ");
        tree.postorder(); // Expected: 10 30 20

        System.out.println();

        // --- RR Rotation Test ---
        // Insert in increasing order to force left rotation
        AVLTree tree2 = new AVLTree();
        for (int key : keys) {
            tree2.insert(key);
        } // triggers RR rotation at 10

        System.out.println("After RR rotation:");
        System.out.print("Inorder: ");
        tree2.inorder(); // Expected: 10 20 30
        System.out.print("Preorder: ");
        tree2.preorder(); // Expected: 20 10 30
        System.out.print("Postorder: ");
        tree2.postorder(); // Expected: 10 30 20

        System.out.println();

        // --- LR Rotation Test ---
        AVLTree tree3 = new AVLTree();
        for (int key : keys) {
            tree3.insert(key);
        } // triggers LR rotation at 30

        System.out.println("After LR rotation:");
        System.out.print("Inorder: ");
        tree3.inorder(); // Expected: 10 20 30
        System.out.print("Preorder: ");
        tree3.preorder(); // Expected: 20 10 30
        System.out.print("Postorder: ");
        tree3.postorder(); // Expected: 10 30 20

        System.out.println();

        // --- RL Rotation Test ---
        AVLTree tree4 = new AVLTree();
        for (int key : keys) {
            tree4.insert(key);
        } // triggers RL rotation at 10

        System.out.println("After RL rotation:");
        System.out.print("Inorder: ");
        tree4.inorder(); // Expected: 10 20 30
        System.out.print("Preorder: ");
        tree4.preorder(); // Expected: 20 10 30
        System.out.print("Postorder: ");
        tree4.postorder(); // Expected: 10 30 20
    }
}
