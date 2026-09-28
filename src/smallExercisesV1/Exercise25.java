package smallExercisesV1;

public class Exercise25 {
    static void main(String[] args) {

        //25.Skapa ett program där ett tal sparas

        int number = 2;

        // och det skrivs ut om talet är positivt eller negativt.
        // om number är < 0 => negativt
        // om number > 0 => positivt
        // om number == 0 => varken eller
        if (number < 0) {
            System.out.println(number + " är ett negativt tal");
        } else if (number > 0) {
            System.out.println(number + " är ett positivt tal");
        }
    }
}
