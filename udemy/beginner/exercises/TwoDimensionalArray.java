package udemy.beginner.exercises;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main (String [] args) {
        int [][] playground = new int [3][3];
        Random random = new Random();
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                playground[i][j] = random.nextInt(3)+1;
                System.out.print(playground[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println(game(playground));
    }


    public static boolean game (int[][] playground) {
        boolean result = true;
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length-1; j++) {
                if ((playground[i][j] == playground[i][j+1])) {
                    result = true;
                    } else {
                    result = false;
                    break;
                }
                }
            if (result) {
                return true;
            }
        }

        return result;
    }
}
