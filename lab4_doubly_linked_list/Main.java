package lab4_doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        TextEditor doc1 = new TextEditor();
        doc1.add("hello world");
        doc1.add(" java programming is fun");

        doc1.printCurrent(); // "hello world beautiful"

        doc1.undo();

        doc1.printCurrent(); // "hello world"

        doc1.redo();

        doc1.printCurrent();// "hello world beautiful"

        doc1.undo();

        doc1.add(" java DSA is fun");
        doc1.printCurrent(); // "hello world ugly"

        doc1.redo();
        doc1.printCurrent();
        doc1.undo();
        doc1.undo();
        doc1.undo();
        doc1.printCurrent();

    }

}
