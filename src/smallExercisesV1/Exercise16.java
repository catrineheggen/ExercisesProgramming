package smallExercisesV1;

public class Exercise16 {
    static void main(String[] args) {

        // En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle
        //handlar för minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett
        //visst slag. Skapa ett program som beräknar vad en kund ska betala. Indata till algoritmen
        //ska vara antalet köpta enheter och priset per enhet.

        // pris: 123
        int price = 123;
        //antalVaror: 9
        int nbrArticles = 9;
        //gräns: 1000
        int limit = 1000;
        //rabatt: 0.9
        double discount = 0.9;

        // double???

        //totalpris = pris*antalVaror
        double total = price*nbrArticles;

        //
        //OM totalpris > gräns

        if(total > limit) {
            //
            //totalpris = pris*antalVaror*rabatt

            total = price * nbrArticles * discount;
        }
            //
            //
            //skriva ut totalpriset


            System.out.println(total);

    }


}
