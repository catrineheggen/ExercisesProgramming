package smallExercisesV1;

public class Exercise07 {
    static void main(String[] args) {

        // Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
//liter, pris per liter och eventuell rabatt i procent.
//Utdata är priset som du ska betala.
//Indatan kan vara definierade i variabler.

//bensin: 30
//pris: 15
//rabatt: 5
//Kostnad? 30*15 - 30*15*5/100

        // double???

        int gas = 30;
        int price = 15;
        int discPercent = 5;

        int totalPrice = gas*price;
        int discPrice = totalPrice - totalPrice*discPercent/100;


        System.out.println(discPrice);

    }
}


