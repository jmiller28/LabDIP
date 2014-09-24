package dip.lab2.student.solution2;

/**
 *
 * @author jmiller
 */
public class TipCalculatorManager {

    private TipCalculator tipCalculator;

    public TipCalculatorManager(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public double getTip() {
//        tipCalculator.getTip();
        return tipCalculator.getTip();
    }
}
