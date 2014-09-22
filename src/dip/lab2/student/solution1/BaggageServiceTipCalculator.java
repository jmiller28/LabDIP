package dip.lab2.student.solution1;

/**
 *
 * @author jmiller
 */
public class BaggageServiceTipCalculator extends TipCalculator {

    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;

    private double baseTipPerBag;
    private int bagCount;

    @Override
    public void calculateTip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BaggageServiceTipCalculator(double tipPercent) {
        //this.setServiceRating(q); // perform validation
        //this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getTipForBaggeHandler() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
