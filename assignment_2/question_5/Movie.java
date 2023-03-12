import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<Watch> movieWatchers;

    public Movie(String name, String genre, List<Watch> movieWatchers) {
        this.name = name;
        this.genre = genre;
        this.movieWatchers = movieWatchers;
    }
}
