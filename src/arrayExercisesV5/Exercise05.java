package arrayExercisesV5;

public class Exercise05 {
    static void main(String[] args) {
        int[] numbers = {33, -1, 2, 3, 4, 5, 6, 17, 8, 9,
                6, 1, 2, 34, 4, 5, 6, -7, 78, -9,
                40, 1, 2, 3, 41, 5, 6, -7, 8, 9,
                6, 1, -2, 3, 4, -5, 6, -7, -8, -9,
                7, 1, -42, 3, -4, 95, 6, 7, 8, 39
        };

        //Ta reda på och skriv ut hur många tal som är positiva
        int counter = 0;

        for (int i = 0; i < 50; i++) {
            if (numbers[i] > 0) {
                counter++;
            }
        }

        System.out.println("Antal positiva tal var: " + counter);

    }
}
