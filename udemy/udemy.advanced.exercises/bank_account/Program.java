package udemy.udemy.advanced.exercises.bank_account;

public class Program {
    public static void main(String[] args) {
        Commerzbank commerzbank = new Commerzbank(20_000);
        Deutsche_Bank deutsche_bank = new Deutsche_Bank(10_000);
        KfW kfW = new KfW(15_000);
        Uni_Credit uni_credit = new Uni_Credit(13_000);

        Person person1 = new Person("Kathleen", "Prasatko", 1_345);
        Person person2 = new Person("Hans", "Wurst", 2_345);
        Person person3 = new Person("Sieglinde", "Blume", 3_456);

        commerzbank.openBankAccount(person1);
        deutsche_bank.openBankAccount(person1);
        kfW.openBankAccount(person2);
        uni_credit.openBankAccount(person3);
    }
}
