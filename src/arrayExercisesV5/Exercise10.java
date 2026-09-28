package arrayExercisesV5;

public class Exercise10 {

    public static void main(String[] args) {

        //En array med 50 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal
        //och summan av alla negativa tal i arrayn.

        int[] numbers = {33, -1, 2, 3, 4, 5, 6, 17, 8, 9,
                6, 1, 2, 34, 4, 5, 6, -7, 78, -9,
                40, 1, 2, 3, 41, 5, 6, -7, 8, 9,
                6, 1, -2, 3, 4, -5, 6, -7, -8, -9,
                7, 1, -42, 3, -4, 95, 6, 7, 8, 39,
                40, 1, 2, 3, 41, 5, 6, -7, 8, 123
        };

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                pos += numbers[i];
            } else {
                neg += numbers[i];
            }
        }

        System.out.println(pos);
        System.out.println(neg);


    }

}
