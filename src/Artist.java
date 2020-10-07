import java.util.ArrayList;
import java.util.List;

public class Artist {
    public String name;
    private ArrayList<Album> albums_list = new ArrayList<>();

    public Artist(String name){
        this.name = name;
    }
    
    public void addAlbum(Album album){
        albums_list.add(album);
    }

    public ArrayList<Album> getAlbums() {
        // retrurn으로 Album 클래스의 앨범을 돌려줌
        return albums_list;
    }
}
