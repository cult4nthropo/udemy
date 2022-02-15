package udemy.udemy.advanced.exercises.src.EmployeeHierarchy;

public class Manager extends Employee{
    private int numberOfEmployees;

    public Manager() {
    }

    public Manager(String fn, String ln, long id, int noe) {
        super(fn, ln, id);
        this.numberOfEmployees = noe;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
