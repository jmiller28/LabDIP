package dip.lab2.student.solution1;

/**
 *
 * @author jmiller28
 */
public class TipCalculatorManager {

    private TipCalculator tipCalculator;

    public TipCalculatorManager(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public void CalculateTip() {

        tipCalculator.calculateTip();
    }
}
