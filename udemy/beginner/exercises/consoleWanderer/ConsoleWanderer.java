package udemy.beginner.exercises.consoleWanderer;

import java.util.Scanner;

public class ConsoleWanderer {
    public static void main (String [] args) {
        System.out.println("Wie breit soll dein Spielfeld sein?");
        Scanner scanner = new Scanner(System.in);
        Playground playground = new Playground();
        int rightBoarder = scanner.nextInt();
        playground.setRightBoarder(rightBoarder);
        System.out.println("Wie hoch soll dein Spielfeld sein?");
        int buttomBoarder = scanner.nextInt();
        playground.setButtomBorder(buttomBoarder);
        playground.drawPlayground();
    }
}
