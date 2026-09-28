package smallExercisesV1;

public class Exercise05 {
    static void main(String[] args) {

        // 5. Definiera ett heltal i en variabel som anger svenska kronor. Skriv ut motsvarande värde
        //i pund respektive dollar. Antag att kursen är: 1 dollar = 6 kr, 1 pund = 10 kr.

        int sek = 600;
        int dollar = sek/6;
        int pound = sek/10;
        System.out.println("100 kr är " + dollar +" dollar.");
        System.out.println("100 kr är " + pound +" pund");



    }
}
