/**
 * File for a Song class to be used in the Playlist Project
 * @author Cole Mallinger and Gavin Cho
 * @version 01/12/2023
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private String duration;
    private boolean like;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
public Song(String myName, String myArtist, String myDuration){
    name = myName;
    artist = myArtist;
    duration = myDuration;
    like = false;
}




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
public String getName(){
    return name;
}

public String getArtist(){
    return artist;
}

public String getDuration(){
    return duration;
}

public void like(){
    like = true;
}

public void unlike(){
    like = false;
}

public boolean getLike(){
    return like;
}

public String toString(){
    return name + " by " + artist + " (" + duration + ") ";

}



}