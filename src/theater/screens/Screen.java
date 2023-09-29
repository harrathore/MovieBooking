package theater.screens;

import theater.enums.SEAT_TYPE_ENUM;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private Integer screenNumber;
    private List<Seat> allSeats;

    public Screen(Integer screenNumber){
        this.screenNumber = screenNumber;
        allSeats = new ArrayList<>();
        this.createAllSeats();
    }

    private void createAllSeats(){
        for(int i=0; i<10; i++){
            Seat seat = new Seat(i+1, SEAT_TYPE_ENUM.CLASSIC);
            allSeats.add(seat);
        }
    }

    public String addSeat(Seat seat){
        allSeats.add(seat);
        return "Added";
    }

    public Integer getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(Integer screenNumber) {
        this.screenNumber = screenNumber;
    }

    public List<Seat> getAllSeats() {
        return allSeats;
    }

    public void setAllSeats(List<Seat> allSeats) {
        this.allSeats = allSeats;
    }
}
