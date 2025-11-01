package lab9_arithmetic_tree_driver;

public class ExpressionTreeDriver {
    public static void main(String[] args) {
        // 1. Build the Tree
        // Manually build the tree for: ( (3 + 7) * (9 - 4) )
        //
        // *
        // / \
        // + -
        // / \ / \
        // 3 7 9 4
        //

        BinaryTreeNode root = new BinaryTreeNode("*");

        BinaryTreeNode nodePlus = new BinaryTreeNode("+");
        BinaryTreeNode nodeMinus = new BinaryTreeNode("-");
        root.left = nodePlus;
        root.right = nodeMinus;

        BinaryTreeNode node3 = new BinaryTreeNode("3");
        BinaryTreeNode node7 = new BinaryTreeNode("7");
        nodePlus.left = node3;
        nodePlus.right = node7;

        BinaryTreeNode node9 = new BinaryTreeNode("9");
        BinaryTreeNode node4 = new BinaryTreeNode("4");
        nodeMinus.left = node9;
        nodeMinus.right = node4;

        // 2. Perform Traversals
        System.out.println("--- Preorder Traversal (Prefix) ---");
        root.traversePreorder(root);

        System.out.println("\n\n--- Inorder Traversal (Infix) ---");
        root.traverseInorder(root);

        System.out.println("\n\n--- Postorder Traversal (Postfix) ---");
        root.traversePostorder(root);
    }
}
