package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;

    SalariedEmployee(double annualSalary) {
        setAnnualSalary(annualSalary);
    }

    @Override
    public double getAnnualWages() {
        return annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0) {
            throw new IllegalArgumentException();

        }
        this.annualSalary = annualSalary;
    }

}
