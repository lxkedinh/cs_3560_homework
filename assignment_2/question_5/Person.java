import java.util.List;

public class Person {
    private String name;
    private List<Watch> moviesWatched;

    public Person(String name, List<Watch> moviesWatched) {
        this.name = name;
        this.moviesWatched = moviesWatched;
    }
}
