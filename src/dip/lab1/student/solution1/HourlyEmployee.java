package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    @Override
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0 || hourlyRate > 100) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

}
