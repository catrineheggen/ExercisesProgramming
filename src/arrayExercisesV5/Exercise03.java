package arrayExercisesV5;

public class Exercise03 {
    static void main(String[] args) {

        // 3.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.

        //datatyp[] variabelNamn = {värde, värde, värde};
        int[] numbers = {33, 1, 2, 3, 4, 5, 6, 17, 8, 9,
                0, 1, 2, 34, 4, 5, 6, 7, 78, 9,
                40, 1, 2, 3, 41, 5, 6, 7, 8, 9,
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                0, 1, 42, 3, 4, 95, 6, 7, 8, 39
        };

        //int num = 33;
        //num = num*2;
        //num *= 2;
        //numbers[0] = numbers[0] * 2;
        //numbers[0] *= 2;

        int index = 0;

        for(int i =0; i<50; i++) {
            numbers[i] *= 2;
        }

        for(int i =0; i<50; i++) {
            System.out.println(numbers[i]);
        }



    }

}