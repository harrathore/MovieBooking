package Database;

import theater.models.SearchTheaterRequestModel;
import theater.Theater;

import java.util.ArrayList;
import java.util.List;

public class ShowsCatalog {
    private List<Theater> allTheaters;

    private static ShowsCatalog showsCatalog = new ShowsCatalog();

    private ShowsCatalog(){
        allTheaters = new ArrayList<>();
    }

    public static ShowsCatalog getInstanceOfCatalog(){
        return showsCatalog;
    }

    public List<Theater> getAllTheaters() {
        return allTheaters;
    }

    public void addTheaterToCatalog(Theater theater) {
        this.allTheaters.add(theater);
    }

    public List<Theater> searchTheater(SearchTheaterRequestModel searchTheaterRequestModel){
        return this.allTheaters;
    }
}
