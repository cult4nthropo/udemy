package EmployeeHierary;

public class Program {
    public static void main (String[] args) {

        Person person = new Person();
        Employee employee = new Employee();
        Employee employee1 = new Employee("Anders", "von hadern", 2);
        Manager manager = new Manager();
        Manager manager1 = new Manager();
        Assistant assistant = new Assistant();
        Assistant assistant1 = new Assistant("Kati", "Wurzelzwerg", 3, 36);

    }

    }
