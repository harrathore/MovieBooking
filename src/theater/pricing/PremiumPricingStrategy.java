package theater.pricing;

public class PremiumPricingStrategy implements SeatPricingStrategy {
    @Override
    public Integer getThePrice() {
        return 700;
    }
}
