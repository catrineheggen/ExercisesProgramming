package smallExercisesV1;

public class Exercise03 {
    static void main(String[] args) {

        //Skapa ett program där antal timmar är definierad i en variabel. Programmet beräknar
        //och skriver ut hur mycket det blir omvandlat till minuter resp. sekunder

        //datatyp variabelNamn = Värde;

        int hours = 3;
        int minutes = hours*60;
        int seconds = minutes*60;

        //3 timmar blir
        //180 minuter
        //10800 sekunder



        System.out.println(hours +" timmar blir:");
        System.out.println(minutes +"minuter");
        System.out.println(seconds +"sekunder");


    }
}
