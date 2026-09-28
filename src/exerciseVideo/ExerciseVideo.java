package exerciseVideo;

public class ExerciseVideo {

    static void main(String[] args) {
        // Skapa ett program som använder tre tal
        //Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.
        //
        int tal1 = 5;
        int tal2 = 10;
        int tal3 = 15;
        int summa = tal1 + tal2 + tal3;
        int middle = summa / 3;
        System.out.println("The sum is: " +summa);
        System.out.println("The mean is: " +middle);

        //Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        //Rektangelns sidor ska läsas in.

        int side1 = 10;
        int side2 = 20;
        int area = side1*side2;
        int cirkum = (side1 + side2) *2;

        System.out.println();
        System.out.println(area);
        System.out.println(cirkum);
    }
}
