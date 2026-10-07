package exercise2Switch;

import java.util.Scanner;
    public class Switch03 {

        public static void main(String[] args) {

            //Skapa en enkel kalkylator som tar emot två tal
            //Använd Scanner och spara två tal från konsolen i var sin variabel
            Scanner scan = new Scanner(System.in);

            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            // och en operation (addition, subtraktion, multiplikation, division)
            // Läs in + - * / (add, sub, mul, div)
            String operator = scan.nextLine();

            // från användaren. Använd en switch-sats för att bestämma vilken operation som ska utföras baserat på användarens input.
            //Switchsats där operation bestämmer vilken kod som ska köras
            //För varje operation skriv ut resultatet av uträkningen

            switch (operator) {
                case "+":
                    int sum = number1 + number2;
                    System.out.println(number1 +" + " +number2 +" = " +sum);
                    break;
                case "-":
                    int dif = number1 - number2;
                    System.out.println(number1 +" - " +number2 +" = " +dif);
                    break;
                case "*":
                    int prod = number1 * number2;
                    System.out.println(number1 +" * " +number2 +" = " +prod);
                    break;
                case "/":
                    int div = number1 / number2;
                    System.out.println(number1 +" / " +number2 +" = " +div);
                    break;
                default:
                    System.out.println("Not a legal operator");
            }

        }

    }