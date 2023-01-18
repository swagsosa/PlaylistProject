

import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    public ArrayList<Song> songs;
    private String title, artist, duration;
    private boolean status;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

    public Playlist(){
        this.title = title; this.artist = artist; this.duration = duration; this.status = status;
        songs = new ArrayList<Song>();
    }
    

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    public void getSongs(){
        for(Song x : songs){
            if(x.is)
        }
    }
    
    public void addPlaylist(Song s){
        songs.add(s);
    }

    public void likeSong(int pos){
        if(pos >= 0 && pos < songs.size()){
            Song s = songs.get(pos);
            s.like();
        } else{
            System.out.println("No song with that index exists!");
        }
    }

    public void remove(int pos){
        songs.remove(pos);
    }

    public void totalduration(Song s){
       int total = 0;
        for (int i = 0; i < songs.size() - 1; i++){
            
            s.getDuration();
    }
}

    public void removeLiked(){
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).isLiked()){
                songs.remove(i);
                i--;
            }
        }
    }
}