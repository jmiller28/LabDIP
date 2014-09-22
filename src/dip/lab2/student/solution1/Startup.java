package dip.lab2.student.solution1;

import java.text.NumberFormat;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author jmiller
 */
public class Startup {

    public enum ServiceQuality {

        GOOD(0.20), FAIR(0.15), POOR(0.10);
        private final double tipPercent;

        private ServiceQuality(double tipPercent) {
            this.tipPercent = tipPercent;
        }

        public double getTipPercent() {
            return tipPercent;
        }
    }

    public static void main(String[] args) {
        double tipPercent = 0.0;
        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"GOOD", "FAIR", "POOR"};
        String initialSelection = "GOOD";

        Object selection = JOptionPane.showInputDialog(null, "Please rate the level of service received:",
                "Service Level", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println(selection);
        if (selection != null) {
            ServiceQuality sq = ServiceQuality.valueOf(selection.toString());
            switch (sq) {
                case GOOD:
                    tipPercent = 0.20;
                    System.out.println(tipPercent);
                    break;
                case FAIR:
                    tipPercent = 0.15;
                    System.out.println(tipPercent);
                    break;
                case POOR:
                    tipPercent = 0.10;
                    System.out.println(tipPercent);
                    break;
            }
            TipCalculator tc = new FoodServiceTipCalculator(tipPercent);
            
            TipCalculatorManager tipCalculatorManager = new TipCalculatorManager(tc);
        tipCalculatorManager.CalculateTip(tipPercent);
        }

        //TipCalculator input = new BaggageServiceTipCalculator(tipPercent);

        //TipCalculator tc = new FoodServiceTipCalculator(tipPercent);

//        TipCalculatorManager tipCalculatorManager = new TipCalculatorManager(tc);
//        tipCalculatorManager.CalculateTip(tipPercent);
    }


}
