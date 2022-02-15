package udemy.udemy.advanced.exercises.bank_account;

public class Person {
    private String firstName;
    private String lastName;
    private double money;

    public Person(String firstName, String lastName, double money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public double getMoney() {
        return money;
    }
}
