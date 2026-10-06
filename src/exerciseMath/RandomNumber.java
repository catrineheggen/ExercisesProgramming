package exerciseMath;

public class RandomNumber {
    static void main(String[] args) {

        // Math.random();
        //Ger ett slumpmässigt tal som är >= 0.0 och <1.0
        // define the range
        int min = 1000;
        int max = 9999; //för att få ett fyrsiffrigt tal
        int range = max - min + 1;


        // range 8999
        // range 8999*1 + 1 + 1000 = 9000+1000 = 10000
        // PGA --> Math.random();
        // Ger ett slumpmässigt tal som är >= 0.0 och <1.0, MINDRE än 1.0. (int) omvandlar till heltal
        // för det går inte att göra beräkningen med en double och en int.

        //generate random numbers from min to max
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);

        }

    }
}
