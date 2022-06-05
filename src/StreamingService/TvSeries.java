package StreamingService;

public class TvSeries extends Video {
    private int episodeNumber;
    private int seasonNumber;

    public TvSeries(String title, int year, String director, String genre, int episodeNumber, int seasonNumber) {
        super(title, year, director, genre);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
}
