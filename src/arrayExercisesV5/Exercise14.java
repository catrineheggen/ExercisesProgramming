package arrayExercisesV5;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        //Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Det är
        //inte vanligt att man låter nämnaren vara negativ. Om så är fallet ska bråket ändras så att
        //nämnaren blir positiv.

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.println("Skriv in två tal. Täljare och nämnare");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        if (numbers[1] == 0) {
            System.out.println("Nämnaren får inte vara 0");
        } else if (numbers[1] < 0) {
            numbers[1] *= -1;
            System.out.println(numbers[0] + " / " + numbers[1] + " = " + (numbers[0] / numbers[1]));
        } else {
            System.out.println(numbers[0] + " / " + numbers[1] + " = " + (numbers[0] / numbers[1]));
        }


    }
}
