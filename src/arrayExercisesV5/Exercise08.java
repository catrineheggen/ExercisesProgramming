package arrayExercisesV5;

public class Exercise08 {

    public static void main(String[] args) {

        //En array med 50 inlästa tal finns.
        int[] numbers = {33, 1, 2, 3, 4, 5, 6, 17, 8, 9,
                0, 1, 2, 34, 4, 5, 6, 7, 78, 9,
                40, 1, 2, 3, 41, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 42, 3, 4, 95, 6, 7, 8, 39,
                0, 1, 42, 3, 4, 95, 6, 7, 8, 39
        };

        // Beräkna och skriv ut summan och medelvärdet av de 50 talen.

        //33 + 1 + 2...+39 (1+2+3+4+5 = 15)
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Summan blir: " + sum);

        //summan/(antal tal) 15/5 = 3

        double average = sum / numbers.length;

        System.out.println("Medeltalet är: " + average);


    }

}
