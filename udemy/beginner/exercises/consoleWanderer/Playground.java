package udemy.beginner.exercises.consoleWanderer;

public class Playground {

    final char stone = '#';

    private char[][] playground;

    Playground() {
        playground = new char[10][10];
    }

    public char[][] getPlayground() {
        return playground;
    }

    public void setPlayground(char[][] playground) {
        this.playground = playground;
    }

    public char getStone() {
        return stone;
    }

    /**
     * creates the playground
     */
    public void buildPlayground() {

        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if ((i == 0) || (i == playground.length-1) || (j == 0) || (j == playground[i].length-1)) {
                    playground[i][j] = stone;
                } else {
                    playground[i][j] = ' ';
                }
            }
        }
    }

    /**
     * Draws the playground
     * '#' marks the borders of the playground
     */
    public void drawPlayground() {

        for (int i = 0; i < playground.length; i ++){
            for (int j = 0; j < playground[i].length; j++) {
                System.out.print(playground[i][j]);
            }
            System.out.println();
        }
    }
}
