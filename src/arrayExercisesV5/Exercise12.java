package arrayExercisesV5;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        //Skapa ett program som läser in 10 heltal till en array
        Scanner scan = new Scanner(System.in);

        //Skapa en ny tom array med 10 platser
        int[] numbers = new int[10];
        //Läsa in och spara tal i array 10 gånger
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        // och sedan skriver ut talen
        //baklänges. Endast en array ska användas.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[numbers.length - 1 - i]);
        }

    }

}
