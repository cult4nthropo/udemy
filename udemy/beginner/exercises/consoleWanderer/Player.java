package udemy.beginner.exercises.consoleWanderer;

public class Player {
    private char[] playerSign;
    private int currentColumn;
    private int currentRow;

    private int playerDirection;

    Player(Playground playground) {
        playerSign = new char[4];
        playerSign[0] = '^';
        playerSign[1] = '>';
        playerSign[2] = 'v';
        playerSign[3] = '<';
        currentColumn = 3;
        currentRow = 3;
        playerDirection = 0;
        playground.getPlayground()[currentRow][currentColumn] = playerSign[playerDirection];
    }

    /**
     * The array playerSign marks a right rotation with ascending index.
     * To generate a right rotation of the player, we ad 1 to the index
     * or substract 1 if the end of the array is reached
     */
    public void setPlayerDirection(String playerDirection) {
        if (playerDirection.equals("a")) {
            this.playerDirection = 3;
        } else if (playerDirection.equals("w")) {
            this.playerDirection = 0;
        } else if (playerDirection.equals("d")) {
            this.playerDirection = 1;
        } else if (playerDirection.equals("s")) {
            this.playerDirection = 2;
        } 
    }


    public void move(Playground playground) {
        playground.getPlayground()[currentRow][currentColumn] = ' ';
        if (playerDirection == 0) {
            if (playground.getPlayground()[currentRow - 1][currentColumn] == playground.getStone()) {
                System.out.println("Da geht es nicht weiter");
                playground.getPlayground()[currentRow][currentColumn] = playerSign[playerDirection];
            } else {
                playground.getPlayground()[currentRow - 1][currentColumn] = playerSign[playerDirection];
                currentRow -= 1;
            }
        } else if (playerDirection == 1) {
            if (playground.getPlayground()[currentRow][currentColumn + 1] == playground.getStone()) {
                System.out.println("Da geht es nicht weiter");
                playground.getPlayground()[currentRow][currentColumn] = playerSign[playerDirection];
            } else {
                playground.getPlayground()[currentRow][currentColumn + 1] = playerSign[playerDirection];
                currentColumn += 1;
            }
        } else if (playerDirection == 2) {
            if (playground.getPlayground()[currentRow + 1][currentColumn] == playground.getStone()) {
                System.out.println("Da geht es nicht weiter");
                playground.getPlayground()[currentRow][currentColumn] = playerSign[playerDirection];
            } else {
                playground.getPlayground()[currentRow + 1][currentColumn] = playerSign[playerDirection];
                currentRow += 1;
            }
        } else if (playerDirection == 3) {
            if (playground.getPlayground()[currentRow][currentColumn - 1] == playground.getStone()) {
                System.out.println("Da geht es nicht weiter");
                playground.getPlayground()[currentRow][currentColumn] = playerSign[playerDirection];
            } else {
                playground.getPlayground()[currentRow][currentColumn - 1] = playerSign[playerDirection];
                currentColumn -= 1;
            }
        }
        playground.drawPlayground();

    }
}
