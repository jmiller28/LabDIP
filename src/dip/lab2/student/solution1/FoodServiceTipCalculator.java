package dip.lab2.student.solution1;

import java.text.NumberFormat;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author jmiller
 */
public class FoodServiceTipCalculator extends TipCalculator {

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be greater than or equal to " + MIN_BILL;

    private double billAmount;
    private double tipAmount;
    
    
    @Override
    public void calculateTip(double tipPercent) {
        System.out.println(tipPercent);
        billAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amoumt of the bill:"));
        //billAmount * tipPercent
        String output = "The suggested tip is " + billAmount * tipPercent;
        JOptionPane.showMessageDialog(null, output);

    }

//    public FoodServiceTipCalculator(double tipPercent) {
//        this.setServiceRating(q);
//        this.setBill(billAmt);
//    }
//
//    public double getTip() {
//        double tip = 0.00; // always initialize local variables
//
//        switch (serviceQuality) {
//            case GOOD:
//                tip = bill * GOOD_RATE;
//                break;
//            case FAIR:
//                tip = bill * FAIR_RATE;
//                break;
//            case POOR:
//                tip = bill * POOR_RATE;
//                break;
//        }
//
//        return tip;
//    }
//
//    public final void setBill(double billAmt) {
//        if (billAmt < MIN_BILL) {
//            throw new IllegalArgumentException(BILL_ENTRY_ERR);
//        }
//        bill = billAmt;
//    }

//    public final void setServiceRating(ServiceQuality q) {
//        // No need to validate because enums provide type safety!
//        serviceQuality = q;
//    }
//
//    public ServiceQuality getServiceQuality() {
//        return serviceQuality;
//    }

    public FoodServiceTipCalculator(double tipAmount) {
        this.tipAmount = tipAmount;
    }

}
