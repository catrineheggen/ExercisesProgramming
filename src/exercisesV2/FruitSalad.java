package exercisesV2;

public class FruitSalad {
    static void main(String[] args) {
        // vi måste ha en main metod för att kunna köra programmet

        // definition av att skapa objekt
        // dataTyp) variabelNamn = new konstrukor();
        // KlassNamn/(datatyp) variabelNamn = new KlassNamn(); (konstruktor)

        Fruit apple = new Fruit();

        Fruit melon = new Fruit("green");
        Fruit banana = new Fruit("yellow");

        apple.print();
        melon.print();
        banana.print();

    }
}
