package veckouppgiftVecka1;

public class Vecka1Overlevnadslager {
    static void main(String[] args) {

        // Start. Du ska skapa en simulering som visar om en person klarar
        // sig i 10 dagar på ett överlevnadsläger.
        //Programmet ska använda: variabler, if/else, en loop (for eller while), utskrifter
        //För att starta olika simuleringar ska du ändra startvärdena i programmet
        // och köra simuleringen flera gånger.
        //Variabler: energy, food, water
        //Alla variabler ska ha ett startvärde mellan 0 och 100 som du bestämmer.

        int energy = 200;
        int food = 200;
        int water = 200;

        for (int day = 1; day <= 10; day++) {

            water = water - 8;

            if (water < 30) {
                food = food - 12;
            } else {
                food = food - 6;
            }


            if (water < 30) {
                energy = energy - 12;
            } else {
                energy = energy - 5;
            }

            if (food < 30) {
                energy = energy - 12;
            } else {
                energy = energy - 5;
            }

            if (energy <=0) {
                System.out.println("Personen klarade sig inte.");
                break;
            }
            System.out.println("Dag: " + day);
            System.out.println(energy + " energi");
            System.out.println(food + " mat");
            System.out.println(water + " vatten");

        }

        if (energy > 0) {
            System.out.println("Personen överlevde efter 10 dagar!");
        }

    }
}
