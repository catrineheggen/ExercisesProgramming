package exerciseMath;

import java.util.Scanner;

public class Random01 {

    public static void main(String[] args) {

        //Skapa ett program som genererar och skriver ut
        // ett slumpmässigt heltal mellan 0 och ett av
        // användaren angivet tal n.
        Scanner scan = new Scanner(System.in);

        // define the range
        int min = 0;
        int max = Integer.parseInt(scan.nextLine());
        int range = max - min + 1;

        // generate random numbers from min to max
        int rand = (int) (Math.random() * range) + min;


    }

}
