package udemy.beginner.exercises;

import java.util.Scanner;

public class GuessANumber {
    public static void main (String [] args) {
        System.out.println("Denk dir eine Ganzzahl zwischen 0 und 1000.");
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 1000;
        int attempts = 0;
        boolean toContinue = true;

        while (toContinue) {
            attempts++;
            int guess = (max + min)/2;
            System.out.println(guess);
            System.out.printf("Ist die Zahl %d ?%n " +
                   "Drück [1] wenn das stimmt, [2] wenn sie zu klein ist und [3] wenn sie zu groß ist:%n", guess);
            int higherOrLower = scanner.nextInt();

            switch (higherOrLower) {
               case 1:
                   System.out.println("Das war die richtige Zahl");
                   toContinue = false;
                   break;
               case 2:
                   min = guess;
                   break;
               case 3:
                   max = guess;
                   break;
               default:
                   System.out.println("Bitte nur 1, 2 oder 3 eingeben.");
                   break;
           }
            System.out.printf("%d Versuche", attempts);
           scanner.close();
        }
    }
}
