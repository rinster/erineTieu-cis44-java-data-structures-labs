package lab4_doubly_linked_list;

public class TextEditor {
    private static class Node {
        String textState;
        Node prev;
        Node next;

        public Node(String text, Node prev, Node next) {
            this.textState = text;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node currentNode;

    public TextEditor() {
        // Start with an initial empty string state.
        Node initialNode = new Node("", null, null);
        this.currentNode = initialNode;
    }

    public void add(String newText) {
        // Create a new node with the updated text.
        String updatedText = currentNode.textState + newText;

        // clear the redo/fwd history
        currentNode.next = null;

        // Set its 'prev' to the current node.
        Node newNode = new Node(updatedText, currentNode, null);
        // Set the current node's 'next' to this new node.
        currentNode.next = newNode;
        // Finally, update currentNode to point to the new node.
        currentNode = newNode;
    }

    public String undo() {
        // Check if currentNode.prev is not null.
        // If it is, move currentNode back and return the text.
        if (currentNode.prev != null) {
            currentNode = currentNode.prev;
            return currentNode.textState;
        }
        return currentNode.textState;
    }

    public String redo() {
        // Check if currentNode.next is not null.
        if (currentNode.next != null) {
            currentNode = currentNode.next;
            return currentNode.textState;
        }
        return currentNode.textState;
    }

    public void printCurrent() {
        System.out.println(currentNode.textState);
    }
}
