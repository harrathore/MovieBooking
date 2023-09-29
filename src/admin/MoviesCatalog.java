package admin;

import theater.Theater;

import java.util.ArrayList;
import java.util.List;

public class MoviesCatalog {
    private List<Theater> allTheaters;

    private static MoviesCatalog moviesCatalog = new MoviesCatalog();

    private MoviesCatalog(){
        allTheaters = new ArrayList<>();
    }

    public static MoviesCatalog getInstanceOfCatalog(){
        return moviesCatalog;
    }

    public List<Theater> getAllTheaters() {
        return allTheaters;
    }

    public void addTheaterToCatalog(Theater theater) {
        this.allTheaters.add(theater);
    }
}
