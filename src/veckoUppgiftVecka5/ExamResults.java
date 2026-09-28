package veckoUppgiftVecka5;

public class ExamResults {
    static void main(String[] args) {

        // Skapa en array med 20 provresultat 0-100.

        int[] results = {45, 50, 55, 65, 75,
                85, 95, 100, 80, 89,
                93, 78, 39, 25, 90,
                66, 59, 49, 99, 97
        };

        // Ett godkänt resultat är 50 poäng eller mer.
        //Programmet ska räkna:
        //Hur många elever som klarade provet
        //Hur många som inte klarade provet

        int studentpass = 0;
        int studentfail = 0;
        // Beräkna klassens genomsnitt.
        double sum = 0;

        int highest = results[0];
        int lowest = results[0];

        for (int i = 0; i < results.length; i++) {
            if (results[i] >= 50) {
                studentpass++;
            } else {
                studentfail++;
            }
            System.out.println(results[i]);
            sum += results[i];
            // Hitta: högsta resultatet och lägsta resultatet
            //Skriv ut: Bästa resultat: 98 och Sämsta resultat: 12
            if (results[i] > highest) {
                highest = results[i];
            }
            if (results[i] < lowest) {
                lowest = results[i];
            }

        }
        double mean = sum / results.length;

        int studentovermean = 0;
        // Gå igenom arrayen igen.
        //Skriv ut vilka indexplatser som har bättre resultat än medelvärdet.
        for (int i = 0; i < results.length; i++){
            if (results[i] > mean) {
                studentovermean++;
                System.out.println("Index: " + i);


            }

        }
        System.out.println("===PROVRAPPORT===");
        System.out.println("Antal elever: " + results.length);
        System.out.println("Antal godkända elever: " + studentpass);
        System.out.println("Antal underkända elever: " + studentfail);
        System.out.println("Medelvärdet är: " + mean);
        System.out.println("Bästa resultat: " + highest);
        System.out.println("Lägsta resultat: " + lowest);
        System.out.println("Antalet elever över medel: " + studentovermean);
    }
}
