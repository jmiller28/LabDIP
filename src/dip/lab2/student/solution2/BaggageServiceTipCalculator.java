package dip.lab2.student.solution2;

/**
 *
 * @author jmiller
 */
public class BaggageServiceTipCalculator implements TipCalculator {

    private double maxBill = 100.00;
    private String billEntryErr
            = "Error: bill must be between " + minBill + " and "
            + maxBill;
    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        setServiceRating(q);
        setBagCount(bags);
        baseTipPerBag = 1.00;
    }

    @Override
    public double getTip() {
        double tip = 0.00;

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public int getBagCount() {
        return bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
}
