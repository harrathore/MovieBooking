package theater.screens;

import theater.enums.SEAT_TYPE_ENUM;

public class Seat {
    private Integer seatNumber;
    private SEAT_TYPE_ENUM seatType;

    public Seat(Integer seatNumber, SEAT_TYPE_ENUM seatType){
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SEAT_TYPE_ENUM getSeatType() {
        return seatType;
    }

    public void setSeatType(SEAT_TYPE_ENUM seatType) {
        this.seatType = seatType;
    }
}
