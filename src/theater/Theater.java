package theater;

import theater.screens.Screen;
import theater.shows.Show;

import java.util.ArrayList;
import java.util.List;


public class Theater {
    private String theaterName;
    private AddressModel addressModel;
    private Integer numberOfScreens;
    private List<Screen> allScreens;
    private List<Show> allShows;

    public Theater(String theaterName, AddressModel addressModel, Integer numberOfScreens){
        this.theaterName = theaterName;
        this.numberOfScreens = numberOfScreens;
        this.addressModel = addressModel;
        this.allScreens = new ArrayList<>();
        this.allShows = new ArrayList<>();
    }

    public String addScreenToTheater(Screen screen){
        allScreens.add(screen);
        return "Screen Added to theater";
    }

    public String addShow(Show show){
        allShows.add(show);
        return "Show added to theater";
    }

    public List<Show> getAllShows(){
        return this.allShows;
    }


}
