package udemy.beginner.exercises;

public class DivisibleBy {
    public static void main (String [] args) {

        for (int i = 1; i <= 100; i++){

            System.out.printf("%s%n", ((i % 3 == 0) && (i % 4 == 0)) ?
                    (i + " ist teilbar durch 3 und 4.") : ((i % 3 == 0) ?
                    (i + " ist teilbar durch 3") : ((i % 4 == 0) ?
                            (i + " ist teilbar durch 4") : i)));

        }
    }
}
