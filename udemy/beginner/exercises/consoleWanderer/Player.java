package udemy.beginner.exercises.consoleWanderer;

public class Player {
    //TODO How to get the right starting position for the player in the playground. New Playground Object is wrong
    Playground playground = new Playground();
    private String symbol = "^";
    private String direction;
    private int xPosition = playground.getButtomBorder()/2;
    private int yPosition = playground.getRightBoarder()/2;

    public String getSymbol() {
        return symbol;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public Player setDirection(String direction) {
        this.direction = direction;
        return this;
    }


    public void move(String direction){
        if (direction == "l" && xPosition > 1) {
            xPosition -= 1;
        } else {
            System.out.println("Da geht es nicht weiter...");
        }
    }
}
