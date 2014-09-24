package dip.lab1.student.solution1;

/**
 *
 * @author jmiller
 */
public class Startup {

    public static void main(String[] args) {

        Employee employee1 = new HourlyEmployee(17.75, 2000);
        Employee employee2 = new SalariedEmployee(40000);
        Employee employee3 = new SalariedBonusEmployee(30000, 1000);
        System.out.println(employee1.getAnnualWages() + " " + employee2.getAnnualWages() + " " + employee3.getAnnualWages());
    }

}
