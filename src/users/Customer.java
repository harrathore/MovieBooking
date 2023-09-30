package users;

import Database.ShowsCatalog;
import theater.exceptions.GenericCustomException;
import theater.models.SearchTheaterRequestModel;
import theater.Theater;
import theater.models.Ticket;
import theater.enums.SEAT_STATUS;
import theater.shows.ShowSeat;
import theater.shows.Show;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Customer extends User{
    private ShowsCatalog catalog;

    public Customer(String name){
        super(name);
        this.catalog = ShowsCatalog.getInstanceOfCatalog();
    }

    public Ticket bookMovieTickets(){
        SearchTheaterRequestModel searchTheaterRequestModel = new SearchTheaterRequestModel();
        List<Theater> allTheater = catalog.searchTheater(searchTheaterRequestModel);
        Set<Show> allShows = allTheater.get(0).getAllShows();

        Optional<Show> show = allShows.stream().findFirst();
        if(show.isPresent()){
            Set<ShowSeat> allShowSeats = show.get().getAllShowSeat();

            List<ShowSeat> allSelectedShowSeats = new ArrayList<>();
            Optional<ShowSeat> firstSeat = allShowSeats.stream().findFirst();
            if(firstSeat.isPresent() && firstSeat.get().getSeatStatus().equals(SEAT_STATUS.EMPTY)){
                allSelectedShowSeats.add(firstSeat.get());
            }

            if(allSelectedShowSeats.size()==0){
                System.out.println("Please select the available seat first");
            }else{
                try{
                    Ticket ticket = show.get().bookShow(allSelectedShowSeats, this.getUserName());
                    System.out.println(ticket);
                    System.out.println("Ticket Booked Successfully !");
                    return ticket;
                }catch (GenericCustomException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        return null;
    }
}
