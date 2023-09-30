package theater.pricing;

public class ClassicPricingStrategy implements SeatPricingStrategy {
    @Override
    public Integer getThePrice() {
        return 500;
    }
}
