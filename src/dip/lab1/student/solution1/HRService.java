package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class HRService {

    private Employee employee;

    public HRService(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getAnnualWages() {
        return employee.getAnnualWages();
    }

}
