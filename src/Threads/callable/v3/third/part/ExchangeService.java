package Threads.callable.v3.third.part;

public class ExchangeService {

    public enum Money {
        USD(1.0), EUR(1.35387), GBP(1.69715), CAD(.92106), MXN(.07683);

        private final Double rate;

        Money(Double rate) {
            this.rate = rate;
        }
    }

    public static Double getRate(Money source, Money destination) {
        return getRateWithDelay(source, destination);
    }

    private static Double getRateWithDelay(Money source, Money destination) {
    	Util.delay();
        return destination.rate / source.rate;
    }

}
