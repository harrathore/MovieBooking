package theater.pricing;

public class StandardPricingStrategy implements SeatPricingStrategy {
    @Override
    public Integer getThePrice() {
        return 300;
    }
}
