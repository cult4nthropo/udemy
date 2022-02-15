package udemy.udemy.advanced.exercises.car_array;

public class Audi implements Drivable {
    private String model;
    private int horsePower;
    private int xPosition;
    private int yPosition;

    public String getModel() {
        return model;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }


    public Audi(String model, int xPosition, int yPosition, int horsePower) {
        this.model = model;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public void drive(int x, int y) {
        this.xPosition += x;
        this.yPosition +=y;
    }

    @Override
    public void printPosition() {
        System.out.printf("Audi %s %n", this.getModel());
        System.out.printf("Position: x=  %d y= %d%n", this.getxPosition(), this.getyPosition());
    }
}
