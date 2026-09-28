package exerciseVideo;

public class HelloWorld {

    static void main(String[] args) {

        //Typ, namnet på vår variabel,variabelnamn,tilldelning, det vi vill spara till variabeln text
        String text = "hej";

        System.out.println(text + "då");

        //text = hej
        //hej +  då => hej då
        text = text + " då";  // Skriver över "behållaren" text så att det blir hej då
        System.out.println(text);

/*


        System.out.println("Hello World!");

        System.out.print("Without ln"+" Mer text!"+" ");

        System.out.println("Hello again!!");

*/
    }

}