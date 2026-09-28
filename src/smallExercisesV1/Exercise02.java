package smallExercisesV1;

public class Exercise02 {
    static void main(String[] args) {

        // 2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9%
        //av försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska vara definierad i en variabel.

        // int är datayp för heltal. double är datatyp för decimaltal. Java använder . inte , i decimaltal

        int salary = 8000;
        int salesum = 50000;
        double salarysum = (salary + (salesum*0.09)) * 3;
        System.out.println("Lönen under tre månader är: " + salarysum + "kr.");


    }
}
