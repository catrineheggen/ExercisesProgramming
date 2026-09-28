package exercisesV2;

import java.util.Scanner;

//ifrån en annan klass
public class MainCalculator {

    // som har en 	main-metod
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in första talet");
        int num1 = scan.nextInt();
        System.out.println("Skriv in andra talet");
        int num2 = scan.nextInt();

        // Skapa ett objekt
        Calculator calc = new Calculator(num1, num2);

        // och anropa denna metod (som ju heter add())
        System.out.print("Summan blir: ");
        int sum = calc.add();
        System.out.println(sum);
        //System.out.println(calc.add());
        System.out.print("Differensen blir: ");
        calc.sub();

        System.out.print("Produkten blir: ");
        calc.mul();

        System.out.print("Kvoten blir: ");
        calc.div();


    }

}