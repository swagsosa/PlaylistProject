/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args){
        Playlist jams = new Playlist();
        System.out.println("Initializing playlist...");
        System.out.println("Adding songs to the playlist...");
        Song one = new Song("Long Time", "Playboi Carti", "2:43");
        jams.addSong(one);
        System.out.println("Added \"Long Time\" by Playboi Carti (2:43)");
        Song two = new Song("When I Was Your Man", "Bruno Mars", "3:35");
        jams.addSong(two);
        System.out.println("Added \"When I Was Your Man\" by Bruno Mars (3:35)");
        Song three = new Song("Blind", "SZA", "3:02");
        jams.addSong(three);
        System.out.println("Added \"Blind\" by SZA (3:02)");
        Song four = new Song("Golden Hour", "JVKE", "3:48");
        jams.addSong(four);
        System.out.println("Added \"Golden Hour\" by JVKE (3:48)");
        Song five = new Song("Flawless", "Yeat", "2:56");
        jams.addSong(five);
        System.out.println("Added \"Flawless\" by Yeat (2:56)");
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        jams.getPlaylist();
        System.out.println();
        System.out.println("Liking \"Long Time\" and \"Blind\"...");
        jams.likeSong(0);
        jams.likeSong(2);
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        jams.getPlaylist();
        System.out.println();
        System.out.println("Printing total playlist duration...");
        System.out.println();
        System.out.println(jams.getTotal());
        System.out.println("Removing \"When I Was Your Man\" from the playlist...");
        jams.removeSong(1);
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        jams.getPlaylist();
        System.out.println();
        System.out.println("Printing only the liked songs...");
        System.out.println();
        jams.getLikedSongs();
        System.out.println();
        System.out.println("Removing liked songs...");
        jams.removeLiked();
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        jams.getPlaylist();
        }
    }