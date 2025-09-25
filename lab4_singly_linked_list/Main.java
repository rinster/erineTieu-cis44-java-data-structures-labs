package lab4_singly_linked_list;

public class Main {
    public static void main(String[] args) {

        Playlist playlist1 = new Playlist();
        Playlist playlist2 = new Playlist();

        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("All I Want for Christmas", "Mariah Carey");
        playlist1.addSong(song1);
        playlist1.addSong(song2);

        playlist1.displayPlaylist();

        playlist1.addSong(new Song("Imagine", "John Lennon"));
        playlist1.addSong(new Song("Hotel California", "Eagles"));

        playlist1.displayPlaylist();
        playlist1.removeSong("Imagine");

        playlist1.displayPlaylist();

        playlist1.playNext();
        playlist1.playNext();
        playlist1.playNext();
        playlist1.playNext();
        playlist1.playNext();

        playlist2.playNext();

    }

}
