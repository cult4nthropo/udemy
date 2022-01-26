package udemy.beginner.exercises;

import java.util.Scanner;

public class MiniCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die erste Zahl eingeben: ");
        int number1 = scanner.nextInt();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        int number2 = scanner.nextInt();

        System.out.println("Bitte noch den Operator angeben: 1 für +, 2 für -, 3 für *, 4 für / : ");
        int operator = scanner.nextInt();

        switch (operator) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Das war wohl kein gültiger Operator.");
        }
    }
}
