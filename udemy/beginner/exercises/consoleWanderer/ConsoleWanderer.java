package udemy.beginner.exercises.consoleWanderer;

import java.util.Scanner;

public class ConsoleWanderer {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        Playground playground = new Playground();

        /**
         * draws the initial playground
         */
        playground.buildPlayground();
        Player player = new Player(playground);
        playground.drawPlayground();
        boolean continueMoving = true;
        while (continueMoving) {
            System.out.println("In welche Richtung willst du gehen?");
            System.out.println("[a] für links, [w] für hoch, [d] für rechts, [s] für runter, [q] um zu beenden");
            String playerdirection = scanner.next();
            if (playerdirection.equals("q")) {
                continueMoving = false;
                System.out.println("Ende");
            }
            player.setPlayerDirection(playerdirection);
            player.move(playground);

        }


    }
}
