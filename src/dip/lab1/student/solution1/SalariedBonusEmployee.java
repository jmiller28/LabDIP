package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class SalariedBonusEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

    public SalariedBonusEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
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

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if (annualBonus < 0) {
            throw new IllegalArgumentException();

        }
        this.annualBonus = annualBonus;
    }

}
