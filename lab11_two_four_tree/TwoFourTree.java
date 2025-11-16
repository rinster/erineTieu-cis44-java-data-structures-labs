package lab11_two_four_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Simplified node structure
class TwoFourNode {
    List<Integer> keys;
    List<TwoFourNode> children;
    TwoFourNode parent;

    public TwoFourNode() {
        keys = new ArrayList<>();
        children = new ArrayList<>();
        parent = null;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    // Check if node is full (3 keys)
    public boolean isFull() {
        return keys.size() == 3;
    }

    public TwoFourNode getNextChild(int key) {
        int i = 0;
        while (i < keys.size() && key > keys.get(i)) {
            i++;
        }
        // If children are empty (leaf), return null
        if (children.isEmpty())
            return null;
        return children.get(i);
    }

    public void insertKey(int key) {
        int i = 0;
        while (i < keys.size() && key > keys.get(i)) {
            i++;
        }
        keys.add(i, key); // insert key at correct position
    }
}

public class TwoFourTree {

    private TwoFourNode root;

    public TwoFourTree() {
        root = new TwoFourNode();
    }

    public void insert(int key) {
        TwoFourNode node = root;

        // 1. Descend to the leaf node
        while (!node.isLeaf()) {
            node = node.getNextChild(key);
        }

        // 2. Insert key in leaf
        node.insertKey(key);

        // 3. Handle overflow by splitting
        while (node != null && node.keys.size() > 3) {
            split(node);
            node = node.parent;
        }
    }

    private void split(TwoFourNode node) {
        int midIndex = 1; // middle key index in 0..3

        TwoFourNode parent = node.parent;
        TwoFourNode rightNode = new TwoFourNode();

        // Middle key to promote
        int midKey = node.keys.get(midIndex);

        // Left node keeps left key(s)
        List<Integer> leftKeys = new ArrayList<>();
        leftKeys.add(node.keys.get(0));

        // Right node takes right key(s)
        rightNode.keys.add(node.keys.get(2));

        // Handle children if internal node
        if (!node.isLeaf()) {
            rightNode.children.add(node.children.get(2));
            rightNode.children.add(node.children.get(3));
            // Update parent pointer for moved children
            for (TwoFourNode child : rightNode.children) {
                child.parent = rightNode;
            }
            // Remove children from original node
            node.children = node.children.subList(0, 2);
        }

        // Update original node keys
        node.keys = leftKeys;

        if (parent == null) {
            // Node is root → create new root
            TwoFourNode newRoot = new TwoFourNode();
            newRoot.keys.add(midKey);
            newRoot.children.add(node);
            newRoot.children.add(rightNode);
            node.parent = newRoot;
            rightNode.parent = newRoot;
            root = newRoot;
        } else {
            // Promote midKey to parent
            parent.insertKey(midKey);
            // Add rightNode as child of parent
            int insertPos = parent.children.indexOf(node) + 1;
            parent.children.add(insertPos, rightNode);
            rightNode.parent = parent;
        }
    }

    // Inorder traversal
    public void inorder() {
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    private void inorder(TwoFourNode node) {
        if (node == null)
            return;

        if (node.isLeaf()) {
            for (int key : node.keys) {
                System.out.print(key + " ");
            }
        } else {
            int i;
            for (i = 0; i < node.keys.size(); i++) {
                if (i < node.children.size()) {
                    inorder(node.children.get(i));
                }
                System.out.print(node.keys.get(i) + " ");
            }
            if (i < node.children.size()) {
                inorder(node.children.get(i));
            }
        }
    }
}
