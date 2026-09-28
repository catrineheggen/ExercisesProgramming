package arrayExercisesV5;

public class PersonalNumber {
    static void main(String[] args) {
        char[] personalNumber = {'9', '0', '0', '1', '0', '1', '-', '1', '2', '3', '4'};

        if (personalNumber[6] == '-') {
            System.out.println("Personnumret innehåller bindestreck på rätt plats");
        } else {
            System.out.println("Ogiltigt, det saknas bindestreck!");
        }
    }
}

//1.I en array finns ett personnummer. Skapa ett program som kontrollerar att
//födelsedatum och de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett
//felmeddelande om så ej är fallet.
