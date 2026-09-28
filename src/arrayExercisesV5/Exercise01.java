package arrayExercisesV5;

public class Exercise01 {

    public static void main(String[] args) {

        //I en array finns ett personnummer. t.ex. 450912-3680
        //      index =   0   1   2   3   4   5   6   7   8   9  10
        char[] number = {'1','9','4','5','0','9','1','2','-','3','6','8','0'};

        //System.out.println(number[6]);


        // Skapa ett program som kontrollerar att
        //födelsedatum och de fyra sista siffrorna åtskiljs av ett bindestreck.

        int index = number.length - 5;

        if(number[index]=='-') {
            System.out.println("korrekt personnummer");
        } else {
            System.out.println("felaktigt personnummer");
        }


        // Skriv ut ett
        //felmeddelande om så ej är fallet.

    }

}