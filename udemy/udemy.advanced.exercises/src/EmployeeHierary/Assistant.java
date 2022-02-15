package udemy.udemy.advanced.exercises.src.EmployeeHierary;

public class Assistant extends Employee{

    private int hoursPerWeek;

    public Assistant(String fn, String ln, long id, int hpw) {
        super(fn, ln, id);
        this.hoursPerWeek = hpw;
    }

    public Assistant() {
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
