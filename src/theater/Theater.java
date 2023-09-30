package theater;

import theater.models.AddressModel;
import theater.screens.Screen;
import theater.shows.Show;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Theater {
    private String theaterName;
    private AddressModel addressModel;
    private Integer numberOfScreens;
    private List<Screen> allScreens;
    private Set<Show> allShows;

    public Theater(String theaterName, AddressModel addressModel, Integer numberOfScreens){
        this.theaterName = theaterName;
        this.numberOfScreens = numberOfScreens;
        this.addressModel = addressModel;
        this.allScreens = new ArrayList<>();
        this.allShows = new HashSet<>();
    }

    public String addScreenToTheater(Screen screen){
        allScreens.add(screen);
        return "Screen Added to theater";
    }

    public String addShow(Show show){
        allShows.add(show);
        return "Show added to theater";
    }

    public String removeShow(Show show){
        allShows.remove(show);
        return "Show removed successfully !";
    }

    public Set<Show> getAllShows(){
        return this.allShows;
    }


}
