package users;

import admin.MoviesCatalog;
import theater.GenericCustomException;
import theater.Theater;
import theater.Ticket;
import theater.screens.ShowSeat;
import theater.shows.Show;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private MoviesCatalog catalog;

    public User(String name){
        this.catalog = MoviesCatalog.getInstanceOfCatalog();
        this.userName = name;
    }

    public String bookMovieTickets(){
        List<Theater> allTheater = catalog.getAllTheaters();
        List<Show> allShows = allTheater.get(0).getAllShows();

        Show show = allShows.get(0);
        List<ShowSeat> allShowSeats = show.getAllShowSeat();

        List<ShowSeat> allSelectedShowSeats = new ArrayList<>();
        allSelectedShowSeats.add(allShowSeats.get(0));
        allSelectedShowSeats.add(allShowSeats.get(1));
        allSelectedShowSeats.add(allShowSeats.get(2));

        try{
            Ticket ticket = show.bookShow(allSelectedShowSeats, this.userName);
            System.out.println(ticket);
            System.out.println("Ticket Booked Successfully !");
        }catch (GenericCustomException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
