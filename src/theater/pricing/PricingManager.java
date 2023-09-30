package theater.pricing;

import theater.enums.SEAT_TYPE_ENUM;
import theater.shows.ShowSeat;
import theater.shows.Show;

public class PricingManager {
    private static PricingManager pricingManager = new PricingManager();
    private PricingManager(){
       // pricingManager = new PricingManager();
    }

    public static PricingManager getInstanceOfPricingManger(){
        return pricingManager;
    }
    public SeatPricingStrategy getThePricingStrategy(Show show, ShowSeat showSeat){
        SEAT_TYPE_ENUM seatType = showSeat.getSeatType();
        if(seatType.equals(SEAT_TYPE_ENUM.CLASSIC)){
            return new ClassicPricingStrategy();
        } else if (seatType.equals(SEAT_TYPE_ENUM.PREMIUM)) {
            return new PremiumPricingStrategy();
        } else {
            return new StandardPricingStrategy();
        }
    }
}
