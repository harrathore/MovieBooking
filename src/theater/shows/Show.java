package theater.shows;

import pricing.PricingManager;
import pricing.SeatPricingStrategy;
import theater.GenericCustomException;
import theater.Movie;
import theater.Ticket;
import theater.enums.SEAT_STATUS;
import theater.enums.SHOW_CAPACITY_STATUS;
import theater.enums.SHOW_STATUS_ENUM;
import theater.screens.Screen;
import theater.screens.Seat;
import theater.screens.ShowSeat;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private Long from;
    private Long to;
    private Screen screen;
    private Movie movie;
    private PricingManager pricingManager;
    private SHOW_STATUS_ENUM showStatus;
    private SHOW_CAPACITY_STATUS capacityStatus;
    private List<ShowSeat> allShowSeat;

    public Show(Long from, Long to, Screen screen, Movie movie){     //Call by admin
      this.from = from;
      this.to = to;
      this.screen = screen;
      this.movie = movie;
      this.showStatus = SHOW_STATUS_ENUM.NOT_STARTED;
      this.capacityStatus = SHOW_CAPACITY_STATUS.EMPTY;
      this.allShowSeat = new ArrayList<>();
      pricingManager = PricingManager.getInstanceOfPricingManger();
      this.createAllShowSeat(screen);
    }

    private void createAllShowSeat(Screen screen){
        List<Seat> allSeats = screen.getAllSeats();
        allSeats.forEach(seat -> {
            ShowSeat showSeat = new ShowSeat(seat);
            allShowSeat.add(showSeat);
        });
    }

    public List<ShowSeat> getAllShowSeat(){
        return allShowSeat;
    }

    public Ticket bookShow(List<ShowSeat> showSeats, String userName) throws GenericCustomException{
        Integer totalAmount = 0;
        for(ShowSeat showSeat : showSeats){
            if(showSeat.getSeatStatus().equals(SEAT_STATUS.BOOKED)){
                throw new GenericCustomException("Seat number " + showSeat.getSeatNumber() +
                        " is already booked");
            }
        }
        for (ShowSeat showSeat : showSeats){
            SeatPricingStrategy pricingStrategy = pricingManager.getThePricingStrategy(this, showSeat);
            totalAmount += pricingStrategy.getThePrice();
            System.out.println(showSeat.bookSeat());
        }
        System.out.println("Total Fair price is : " + totalAmount);
        Ticket ticket = new Ticket(showSeats, totalAmount, true);
        return ticket;
    }

    public String cancelShow(ShowSeat showSeat){
        return null;
    }
}
