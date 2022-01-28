package udemy.beginner.exercises.consoleWanderer;

public class Playground {
    private String stone = "#";
    private int rightBoarder;
    private int buttomBorder;

    public Playground setButtomBorder(int buttomBorder) {
        this.buttomBorder = buttomBorder;
        return this;
    }

    public int getRightBoarder() {
        return rightBoarder;
    }

    public int getButtomBorder() {
        return buttomBorder;
    }

    public Playground setRightBoarder(int rightBoarder) {
        this.rightBoarder = rightBoarder;
        return this;
    }

    public void drawPlayground() {
        String[][] field = new String[rightBoarder][buttomBorder];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.println("done");
                if ((i == 0) || (i == rightBoarder-1) || (j == 0) || (j == buttomBorder-1)) {
                    field [i][j] = "#";
                } else {
                    field[i][j] = " ";
                }
            }
            Player player = new Player();
            field[player.getxPosition()][player.getyPosition()] = player.getSymbol();
            System.out.println(player.getxPosition());
            System.out.println(rightBoarder);
        }
        for (int i = 0; i < field.length; i ++){
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

}
