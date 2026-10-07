package exercise2Switch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Talet motsvarar ingen dag i veckan");
        }


    }

}