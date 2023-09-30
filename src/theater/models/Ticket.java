package theater.models;

import theater.shows.ShowSeat;

import java.util.List;

public class Ticket {
    private Integer ticketNumber;
    private String customerName;
    private List<ShowSeat> bookedSeats;
    private Integer totalAmount;
    private Boolean isPaid;

    public Ticket(String customerName, List<ShowSeat> bookedSeats, Integer totalAmount, Boolean isPaid) {
        this.customerName = customerName;
        this.ticketNumber = (int) Math.random();
        this.bookedSeats = bookedSeats;
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
    }
}
