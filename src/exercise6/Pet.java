package exercise6;

public class Pet {
    private String name;    //attribut

    public Pet(String petName) {//konstruktor, alltid samma namn som klassen,
                                 // ej returnera något som t.ex. void el. string
        name = petName;
    }
    // Skapa en ny metod i klassen Pet
    // som skriver ut attributet name
    public void printName(){
        System.out.println("The name of the pet is: " + name);
    }

    public String getName(){
        return name;
    }
}
//2 Skapa en ny metod i klassen Pet
// som skriver ut returnerar attributet name
//1 Skapa en ny metod i klassen Pet
// som skriver ut attributet name
