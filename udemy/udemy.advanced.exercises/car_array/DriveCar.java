package udemy.udemy.advanced.exercises.car_array;

public class DriveCar {
    public static void main (String [] args) {
        Audi audiA4 = new Audi("A4", 5, 6, 170);
        Audi audiA7 = new Audi("A7", 3, 1, 330);
        Tesla tesla3 = new Tesla("3", 1, 6, 200);
        Tesla teslaS = new Tesla("S", 5, 3, 400);
        Tesla teslaX = new Tesla("X", 2, 5, 360);

        Drivable[] cars = {audiA4, audiA7, tesla3, teslaX, teslaS};

        cars[4].printPosition();
        cars[4].drive(3, 5);
        cars[4].printPosition();

    }
}
