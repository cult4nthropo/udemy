package udemy.udemy.advanced.exercises.bank_account;

public class Bank {
    private String bankName;
    final double creditLimit;

    public Bank(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getBankName() {
        return bankName;
    }

    public Bank setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void openBankAccount(Person person) {
        System.out.println("Konto-Eröffnungs-Programm");
        System.out.println();
        System.out.printf("Hallo %s %s%n", person.getFirstName(), person.getLastName());
        System.out.println("Sie haben Ihr Konto erfolgreich eröffnet");
        System.out.println();
        System.out.printf("Name der Bank: %s%n", this.getBankName());
        System.out.printf("Ihr Kontostand: %.2f%n", person.getMoney());
        System.out.printf("Kreditlimit: %.2f%n", this.getCreditLimit());
        System.out.println("Wir freuen uns auf Ihren nächsten Besuch");
        System.out.println("**************************************************");

    }
}
