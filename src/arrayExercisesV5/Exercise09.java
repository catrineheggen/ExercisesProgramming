package arrayExercisesV5;

public class Exercise09 {

    public static void main(String[] args) {

        int[] numbers = {33, 1, 2, 3, 4, 5, 6, 17, 8, 9,
                50, 1, 2, 34, 4, 5, 6, 7, 78, 9,
                40, 1, 2, 3, 41, 5, 6, 7, 8, 9,
                40, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                70, 1, 42, 3, 4, 95, 6, 7, 8, 39,
                20, 1, 42, 3, 4, 195, 6, 7, 8, 39
        };

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            //kontrollera om det är mindre än smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            //kontrollera om det är större än largest
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }


        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

    }

}
