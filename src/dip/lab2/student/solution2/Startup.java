package dip.lab2.student.solution2;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {

        TipCalculator tipCalculator = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
//        TipCalculator tipCalculator = new FoodServiceTipCalculator(ServiceQuality.POOR, 55.55);

        System.out.println(tipCalculator.getTip());
    }

}
