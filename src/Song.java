public class Song {
    public String song_name;
    private Artist artist;
    private Album album;

    @Override
    // 노래 제목 - 아티스트
    // 엘범 제목(연도)
    public String toString() {
        return song_name + " - " + artist.name + '\n' + album.album_name + "(" + album.since + ")";
    }

    public Song(String song_name, Artist artist, Album album){
        this.song_name = song_name;
        this.artist = artist;
        this.album = album;

    }
}
