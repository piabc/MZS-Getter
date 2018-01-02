package core;

public class Song {

    private String id;
    private String title;
    private String album;
    private String singer;
    private String downloadedDate;

    public Song(String id, String title, String album, String singer, String downloadedDate) {
        this.id = id;
        this.title = title;
        this.album = album;
        this.singer = singer;
        this.downloadedDate = downloadedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getDownloadedDate() {
        return downloadedDate;
    }

    public void setDownloadedDate(String downloadedDate) {
        this.downloadedDate = downloadedDate;
    }

}
