package arrayExercisesV5;

public class Exercise07 {
    public static void main(String[] args) {

        //Bestäm och skriv ut index för det sista negativa talet i
        //arrayn. (Tips: Börja bakifrån i arrayn).

        int[] numbers = {33, -1, 2, 3, 4, 5, 6, 17, 8, 9,
                6, 1, 2, 34, 4, 5, 6, -7, 78, -9,
                40, 1, 2, 3, 41, 5, 6, -7, 8, 9,
                6, 1, -2, 3, 4, -5, 6, -7, -8, -9,
                7, 1, -42, 3, -4, 95, 6, 7, 8, 39
        };

        int index = 0;

        //gå igenom array baklänges
        for (int i = 49; i >= 0; i--) {
            //jämföra om ett tal är negativt
            //om det är negativt så spara index och avbryt loopen
            if (numbers[i] < 0) {
                index = i;
                break;
            }
        }
        //skriv ut index
        System.out.println("det sista negativa talet har index: " + index);
        System.out.println("och talet är: " + numbers[index]);

    }

}

