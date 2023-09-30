package theater;

import java.util.HashSet;
import java.util.Set;

public class Movie {
    private String movieName;
    private Long releasingOn;
    private Set<String> actorsList;

    public Movie(String movieName, Long releasingOn){
        this.movieName = movieName;
        this.releasingOn = releasingOn;
        this.actorsList = new HashSet<>();
    }
}
