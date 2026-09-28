package smallExercisesV1;

public class Exercise04 {
    static void main(String[] args) {

        // 4. Skapa ett program där tre tal är definierade i var sin variabel. Programmet beräknar
        //och skriver ut summan samt medelvärdet av de tre talen

        int nmbr1 = 3;
        int nmbr2 = 5;
        int nmbr3 = 8;
        int sum = nmbr1 + nmbr2 + nmbr3;
        int mean = sum / 3;
        System.out.println("Summan är: " + sum + " och medelvärdet är: " + mean);
    }
}
