package exerciseVideo;

public class MyInteger {
    //psvm, psvma?

    static void main(String[] args) {
        // int är klass (heltal), t.ex. en ask. number (variabeln) kan liknas med  märket på tändstickor = tilldelar ett värde till variabeln dvs antalet innuti.
        //Matches solstickan = 5;
        int number = 5;
        int nextNumber = 6;

        System.out.println(number);
        System.out.println(nextNumber);

        // Skriver över tidigare number och nextNumber. "Behållaren" variabeln number får
        // ett annat innehåll.
        number = 5 + 3;
        nextNumber = number + 1;

        System.out.println();  // Ger en tom rad
        System.out.println("Now updated to: ");
        System.out.println(number);
        System.out.println(nextNumber);


        //number = number + 3 är samma som number += 3; man lägger till det som står på höger sida.
        number += 3;
        System.out.println(number);
        //nextNumber = nextNumber - 2; är samma som nextNumber - 2
        nextNumber -=2;
        System.out.println(nextNumber);

        System.out.println();  // Ger en tom rad
        System.out.println("Now updated to: ");

        //number += 1; eller number = number + 1
        number++;
        System.out.println(number);

        //number -= 1; eller number = number - 1
        nextNumber--;
        System.out.println(nextNumber);



    }
}
