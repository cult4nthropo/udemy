package udemy.udemy.advanced.exercises.src.EmployeeHierary;

public class Employee extends Person{
    private long employeeID;

    public Employee() {
    }

    public Employee(String fn, String ln, long employeeID) {
        super(fn, ln);
        this.employeeID = employeeID;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }
}
