package smallExercisesV1;

public class Exercise29 {

    public static void main(String[] args) {

        //29.Skapa ett program som beräknar ankomsttiden för ett tåg.
        //I inmatningsrutan finns följande: tidpunkt i timma och minut för avgången (t ex 12:41) körtid i timma och minut (t
        //ex 3:47)
        //I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt
        //passeras ska det även skrivas “NÄSTA DAG“ i utmatningsrutan.

        int depH = 14;
        int depM = 37;
        int driveH = 12;
        int driveM = 32;

        int arrH = depH + driveH;
        int arrM = depM + driveM;

        if(arrM>=60) {
            //arrM = arrM - 60;
            arrM -= 60;

            //arrH = arrH + 1;
            //arrH += 1;
            arrH++;
        }

        if(arrH>=24) {
            arrH -= 24;
            System.out.println("NÄSTA DAG!");
        }

        System.out.println("Arrival at: " +arrH +":" +arrM);



    }

}