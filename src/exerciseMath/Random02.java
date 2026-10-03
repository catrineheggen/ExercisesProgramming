package exerciseMath;

import java.util.Scanner;

public class Random02 {

    public static void main(String[] args) {

        //Skriv ett "Gissa talet"-spel där datorn väljer ett slumpmässigt tal
        // mellan 1 och 100, och användaren får gissa vilket tal det är.
        // Programmet ska ge feedback om gissningen är för hög eller för låg.
        // Användaren gissar tills den har gissat rätt tal.
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int counter = 1;
        while(number != rand) {
            if (number > rand) {
                System.out.println("För högt");
            } else if (number < rand) {
                System.out.println("För lågt");
            }
            number = Integer.parseInt(scan.nextLine());
            counter++;
        }

        System.out.println(rand +" var rätt och du gissade " +counter +" gånger");
    }

}
