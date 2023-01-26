package assignments.Jan23.assignment2;

/*
        AUTHOR: GAUTAM CHANDRA SAHA
        DATE & TIME: 26/01/23 AT 3:34 PM ON Thu
*/


public class ContractEmployee extends Employee{

    private double wage;
    private float hoursWorked;

    public ContractEmployee(int employeeId, String employeeName, double wage, float hoursWorked) {
        super(employeeId, employeeName);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary(){
        double salary = hoursWorked * wage;
        super.setSalary(salary);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

}
