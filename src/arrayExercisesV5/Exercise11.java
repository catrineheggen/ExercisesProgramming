package arrayExercisesV5;

public class Exercise11 {

    public static void main(String[] args) {

        //En array med 10 inlästa tal finns.
        //               0    1  2  3  4  5  6   7  8  9
        int[] numbers = {33, -1, 2, 3, 4, 5, 6, 17, 8, 9};

        int[] reverse = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[9 - i];
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(reverse[i]);
        }

        //Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning.


    }

}
