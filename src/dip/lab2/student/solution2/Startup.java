package dip.lab2.student.solution2;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {

        TipCalculator tipCalculator1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
        TipCalculator tipCalculator2 = new FoodServiceTipCalculator(ServiceQuality.POOR, 55.55);

        System.out.println("Baggage service tip is $" + tipCalculator1.getTip() + ", Food service tip is $" + tipCalculator2.getTip());
    }

}
