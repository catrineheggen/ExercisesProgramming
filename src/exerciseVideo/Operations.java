package exerciseVideo;

public class Operations {

    static void main(String[] args) {

        /* +		plus
-		minus
*		gånger
/		delat med
%	modulus (resten av en division)

7 % 3 = 1
25 % 5 = 0
137 % 10 = 7


         */
        // 7/3 = 2 + resten 1, ej jämnt ut. 25/5 = 5 + resten 0
        int number = 7 % 3 ;
        int nextNumber = 25 % 5;
        // 137/10 = 13,7 men avrundas till 13 + resten 7 (
        int third = 137 % 10;

       // number = nextNumber *3 + 2;  // number är 18
        //nextNumber = number/7;   // nextNumber blir 2 eftersom int alltid avrundar nedåt till heltal

        System.out.println(number);
        System.out.println(nextNumber);
        System.out.println(third);
    }
}
