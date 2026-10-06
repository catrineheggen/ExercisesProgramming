package exerciseMath;

import java.util.Scanner;

public class SquareRoot {
    static void main(String[] args) {

        // Skapa en metod som läser in två kateter (a och b) på en triangel och räknar ut hypotenusan (c)
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        //Tips: Hypotenusan i kvadrat är lika med summan av kvadraterna av kateterna:

        //a*a + b*b = c*c

        //c = sqrt(a*a + b*b)
        double c = Math.sqrt(a*a + b*b);

        System.out.println("Hypotenusan blir c = " + c);
    }
}
