package StreamingService;

public abstract class Video {
    private String title;
    private int year;
    private String director;
    private String genre;

    public Video() {}

    public Video(String title, int year, String director, String genre) {
        setTitle(title);
        setYear(year);
        setDirector(director);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
