import java.util.LinkedList;
import java.util.Scanner;

class MediaPlayer {
    public void play() {
        System.out.println("Playing media...");
    }
}

class MusicPlayer extends MediaPlayer {

    private LinkedList<String> playlist = new LinkedList<>();

    public void addSong(String song) {
        playlist.addLast(song); 
        System.out.println("'" + song + "' added to playlist.");
    }

    public void playNext() {
        if (!playlist.isEmpty()) {
            String current = playlist.removeFirst();
            System.out.println("Now playing: " + current);
        } else {
            System.out.println("Playlist is empty!");
        }
    }


    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist: " + playlist);
        }
    }
}

public class Music {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions: 1-Add Song  2-Play Next  3-Show Playlist  4-Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();
                    player.addSong(song);
                    break;
                case 2:
                    player.playNext();
                    break;
                case 3:
                    player.showPlaylist();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}