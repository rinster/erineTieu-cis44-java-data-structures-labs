package lab4_singly_linked_list;

public class Playlist {
    private static class Node {
        Song song;
        Node next;

        public Node(Song song, Node next) {
            this.song = song;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private Node currentNode;
    private int size;

    public Playlist() {
        this.head = null;
        this.tail = null;
        this.currentNode = null;
        this.size = 0;
    }

    public void addSong(Song song) {
        Node newNode = new Node(song, null);
        // Handle adding empty list
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else { // Handle tail
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public void removeSong(String title) {
        if (head == null)
            return; // empty list

        // Removing the head
        if (head.song.getTitle().equals(title)) {
            head = head.next;
            tail = null;
        }
        // Handle tail and else where
        Node currNode = head;
        while (currNode.next != null) {
            if (currNode.next.song.getTitle().equals(title)) {
                // handle tail
                if (currNode.next == tail) {
                    tail = null;
                }
                // handle curr pointer to remove the next
                currNode.next = currNode.next.next;
                this.size--;
                return;
            }
            currNode = currNode.next; // advance pointer
        }
    }

    public void playNext() {
        // If currentNode is null, start from the head.
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }
        if (currentNode == null || currentNode.next == null) {
            currentNode = head;
        } else {
            currentNode = currentNode.next;
        }

        System.out.println("Playing: " + currentNode.song.getTitle() + " by " + currentNode.song.getArtist());
    }

    public void displayPlaylist() {
        // Traverse from the head and print each song.
        Node pointer = head;
        System.out.println("+++++++++++++  Displaying Playlist  +++++++++++++");
        while (pointer != null) {
            System.out.println(pointer.song.getTitle() + " by " + pointer.song.getArtist());
            pointer = pointer.next;
        }
        System.out.println("++++++++++++++  End of Playlist  ++++++++++++++++");
    }
}
