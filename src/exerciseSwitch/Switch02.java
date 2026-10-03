package exerciseSwitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();

        month = month.toLowerCase();

        switch(month) {
            case "januari", "februari", "december":
                System.out.println("Vinter");
                break;
            case "mars", "april", "maj":
                System.out.println("Vår");
                break;
            case "juni", "juli", "augusti":
                System.out.println("Sommar");
                break;
            case "september", "oktober", "november":
                System.out.println("Höst");
                break;
            default:
                System.out.println("Detta är inte en månad");
        }


    }

}