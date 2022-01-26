package udemy.beginner.exercises;

import java.util.Scanner;

public class BiggestNumber {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groﬂ soll der Array sein?");
        int arraySize = scanner.nextInt();

        int [] numberArray = new int[arraySize];
        int max = numberArray[0];

        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Die Zahl an der Stelle %d vom Array bitte: ", i +1);
            numberArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numberArray[i] + ", ");
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        System.out.printf("Die grˆﬂte Zahl im Array ist %d.", max);
    }
}
