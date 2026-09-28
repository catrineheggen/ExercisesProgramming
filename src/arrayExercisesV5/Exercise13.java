package arrayExercisesV5;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        //Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array
        //med två platser.
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.println("Skriv in två tal. Täljare och nämnare");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        // Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande
        //skrivas ut om så är fallet.
        if (numbers[1] == 0) {
            System.out.println("Nämnaren får inte vara 0");
        } else {
            System.out.println(numbers[0] + " / " + numbers[1] + " = " + (numbers[0] / numbers[1]));
        }

    }

}
