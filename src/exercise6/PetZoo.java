package exercise6;

public class PetZoo {
    static void main(String[] args) {
        Pet dog = new Pet("Fido");
        Pet cat = new Pet("Missan");
        Pet rabbit = new Pet("Koko");

        //Använd denna metod ifrån klassen
// PetZoo på dina tre nyligen skapade objekt
       /* dog.printName();
        cat.printName();
        rabbit.printName();*/

        // Använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objektoch spara värdet i en variabel

        String dogName = dog.getName();
        String catName = cat.getName();
        String rabbitName = rabbit.getName();

        //Skriv ut namnen två gånger ifrån PetZoo

        for(int i=0;i<2;i++){
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);
        }

    }
}

// Skapa en klass PetZoo som har en main-metod
// och som anropar konstruktorn i Pet
//
//Spara tre olika djur i ditt PetZoo
//Skapa tre objekt av Pet
//
