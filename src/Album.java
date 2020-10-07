import java.util.ArrayList;

public class Album {
    public String album_name;
    public int since;
    private Artist artist;
    private ArrayList<Song> song_list = new ArrayList<>();
    private Song song;


    public Album(String album_name, int since, Artist artist){
        this.album_name = album_name;
        this.since = since;
        this.artist = artist;
        addTrack(song);

    }

    public void addTrack(Song song){
        song_list.add(song);
    }

    public Song getTrack(int num){
        return song_list.get(num);
    }

}
