package dip.lab2.student.solution1;

import java.text.NumberFormat;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {
        TipCalculator calc = new FoodServiceTipCalculator(ServiceQuality.FAIR, 15.00);

        TipCalculatorManager mgr = new TipCalculatorManager(calc);
        double amt = mgr.getTip();
        System.out.println(amt);
    }
}
