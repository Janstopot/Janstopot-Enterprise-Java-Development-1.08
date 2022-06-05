package StreamingService;

import java.util.List;

public class Movie extends Video{
    List<String> awards;

    public Movie(String title, int year, String director, String genre, List<String> awards) {
        super(title, year, director, genre);
        this.awards = awards;
    }

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }
}
