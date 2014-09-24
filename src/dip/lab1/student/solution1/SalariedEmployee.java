package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;

    public SalariedEmployee(double annualSalary) {
        setAnnualSalary(annualSalary);
    }

    @Override
    public final double getAnnualWages() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0) {
            throw new IllegalArgumentException();

        }
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

}
