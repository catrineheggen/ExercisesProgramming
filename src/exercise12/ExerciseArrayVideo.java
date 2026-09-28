package exercise12;

public class ExerciseArrayVideo {
    static void main(String[] args) {
        //0,        1,      2,      3,      4
        //String[] names = {"Catrine", "Viktor", "Vilma","Jan","Olle"};

        String[] names = new String[5];

        names[0] = "Catrine";
        names[1] = "Viktor";
        names[2] = "Vilma";
        names[3] = "Jan";
        names[4] = "Olle";
        //Skapa ett program som innehåller en array med fem namn
        //type[] varName = {value, value, value};
        //Skriv ut det första och sista namnet
        //arrayName[0]
        //arrayName[1]

        //System.out.println(names[0]);
        //System.out.println(names[4]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        String myString = "hej på dig";

        String[] stringArray = myString.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }


    }

}
