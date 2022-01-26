package udemy.beginner.exercises;

import java.util.Scanner;

public class MiniCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die erste Zahl eingeben: ");
        int number1 = scanner.nextInt();
        System.out.println("Bitte die zweite Zahl eingeben: ");
        int number2 = scanner.nextInt();

        System.out.println("Bitte noch den Operator angeben: 1 f�r +, 2 f�r -, 3 f�r *, 4 f�r / : ");
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
                System.out.println("Das war wohl kein g�ltiger Operator.");
        }
    }
}
