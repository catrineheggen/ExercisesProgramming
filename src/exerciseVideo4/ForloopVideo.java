package exerciseVideo4;

public class ForloopVideo {

    static void main(String[] args) {
        System.out.println("Tal 1-100:");  // Skriver ut text först

        // Skriv ut alla tal ifrån 1-100
        //int tal = 1;
        //while (tal <= 100) {
        //System.out.print(tal + " ");   // Tar bort ln så att det blir en rad istället
        //tal = tal + 1;
        // += 1 och ++ blir samma
        // Gör samma övning med en forloop istället
        for (int i = 0; i < 100; i++) {
            System.out.print((i + 1) + ",");
        }

        System.out.println();

        System.out.println("Alla jämna tal:");
        //Skriv ut alla jämna tal ifrån 1-100
        for (int i = 0; i < 100; i += 2) {
            System.out.print((i+2) + ",");
        }

        //Skriv ut alla fibonnacci-tal ifrån 1-100.
        // Fibonnacci-tal är de två senaste talen adderat och börjar med 1, 1 som första två tal.
        // Exempel: 1, 1, 2, 3, 5, 8, 13, 21

        System.out.println();
        System.out.println("Fibonacci numbers 1-100:");

        int first = 1;

        System.out.println(first + " ");

        int second = 1;

        while(second<=100){
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }


}


