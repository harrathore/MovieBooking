package theater.screens;

import theater.enums.SEAT_STATUS;
import theater.enums.SEAT_TYPE_ENUM;

public class ShowSeat{
    private Seat seat;
    private SEAT_STATUS seatStatus;

    public ShowSeat(Seat seat){
        this.seat = seat;
        this.seatStatus = SEAT_STATUS.EMPTY;
    }

    public String bookSeat(){
        this.seatStatus = SEAT_STATUS.BOOKED;
        return "Seat Booked Successfully";
    }

    public SEAT_STATUS getSeatStatus() {
        return seatStatus;
    }

    public Integer getSeatNumber(){
        return seat.getSeatNumber();
    }

    public SEAT_TYPE_ENUM getSeatType(){
        return seat.getSeatType();
    }
}
