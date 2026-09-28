package smallExercisesV1;

public class Exercise34 {
    static void main(String[] args) {

        // 34.Skapa ett program som skriver ut ett tal i taget med start ifrån 0.
        // När summan av alla tidigare tal är mer än 50 ska programmet avsluta.

        // total > 50 -> avbryta
        // total <= 50 -> fortsätta

        int total = 0;
        //number = 0
        int number = 0;

        //total > 50 -> avbryta
        //total <= 50 -> fortsätta
        while (total <= 50) {
            number++;

            total += number;

            System.out.println("Number: " + number);
            System.out.println("Total: " + total);
        }


    }
}
