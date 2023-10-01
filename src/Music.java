public class Music {
    private String title;
    private Artist artist;
    private int duration;
    private String genera;
    private String albumName;
    private Date releaseDate;

    Music(String title, Artist artist, int duration, String genera, String albumName, Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genera = genera;
        this.albumName = albumName;
        this.releaseDate = releaseDate;

    }

   public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }



    public Artist getArtist() {
        return artist;
    }

    public String getGenera() {
        return genera;
    }

    public String getAlbumName() {
        return albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
        public String toString() {
            String M= String.format("%s %30s %10s%10s%10s%20s", title, artist, duration, genera, albumName, releaseDate);
        return M;
        }
    }

