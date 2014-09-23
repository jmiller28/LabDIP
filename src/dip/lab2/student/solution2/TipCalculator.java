package dip.lab2.student.solution2;

/**
 *
 * @author jmiller
 */
public interface TipCalculator {

    public double minBill = 0.00;
    public String billEntryErr
            = "Error: bill must be greater than or equal to " + minBill;
    public double goodRate = 0.20;
    public double fairRate = 0.15;
    public double poorRate = 0.10;

    double getTip();
}
