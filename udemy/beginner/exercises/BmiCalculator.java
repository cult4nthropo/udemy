package udemy.beginner.exercises;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class BmiCalculator {
    public static void main (String[] args) {
        double weight = 0;
        double height = 0;
        String bmiClassification = bmiClassification(weight, height);
        System.out.println(bmiClassification);
    }

    public static String bmiClassification (double weight, double height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Größe angeben: ");
        height = scanner.nextDouble();
        System.out.println("Bitte das Gewicht angeben: ");
        weight = scanner.nextDouble();

        double bmi = weight/(height * height);

        System.out.println("BMI: " + bmi + ": ");
        if (bmi < 18.5) {
            return "Untergewicht";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normalgewicht";
        } else if (bmi >= 25 && bmi < 30) {
            return " Übergewicht";
        } else if (bmi >= 30 && bmi < 35) {
            return "Adipositas Grad 1";
        } else {
            return "Adipositas Grad 2";
        }
    }
}
