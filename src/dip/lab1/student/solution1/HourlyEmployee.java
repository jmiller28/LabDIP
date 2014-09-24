package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class HourlyEmployee implements Employee {

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0 || hourlyRate > 100) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

}
