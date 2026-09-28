package exerciseVideo2;

public class ExerciseVideo21 {

    static void main(String[] args) {

        // Jämför två tal. Om det första är större än det andra
        // skriv ut ”Första talet är störst”,
        // samt ”Andra talet är störst” om det är tvärt om
        //

        int tal1 = 20;
        int tal2 = 20;
        if(tal1 > tal2){
            System.out.println("första talet är störst");}
        if(tal2 > tal1){
            System.out.println("andra talet är störst");
        }
        // Jämför två tal. Om det första är jämt delbart med det andra
        // Skriv ut ”Jämt delbart”, annars skriv ut ”Inte jämt delbart”

        if(tal1%tal2==0){
            System.out.println("Jämt delbart");
        } else{
            System.out.println("Inte jämt delbart");
        }

    }
}
