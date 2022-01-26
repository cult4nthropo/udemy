package udemy.beginner.exercises;

import java.util.Scanner;

public class BmiCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groﬂ bist du in Metern?");
        double height = scanner.nextDouble();
        System.out.println("Und wie schwer in kg?");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Dein BMI ist %f", bmi);
    }
}
