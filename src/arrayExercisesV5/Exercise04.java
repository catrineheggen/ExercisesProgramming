package arrayExercisesV5;

public class Exercise04 {
    static void main(String[] args) {

        //4.En array med 50 inlästa tal finns.
        int[] numbers = {33, 1, 2, 3, 4, 5, 6, 17, 8, 9,
                0, 1, 2, 34, 4, 5, 6, 7, 78, 9,
                40, 1, 2, 3, 41, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 42, 3, 4, 95, 6, 7, 8, 39
        };

        //Addera talet 2 till talen på indexplats 0, 2, 4,… i arrayn.

        //numbers[0] += 2;
        //numbers[2] += 2;

        for (int i = 0; i < 50; i += 2) {
            numbers[i] += 2;
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(numbers[i]);
        }


    }

}
