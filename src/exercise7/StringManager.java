package exercise7;

public class StringManager {
    static void main(String[] args) {
    // Börja räkna från 0  012345678
        String myString = "some text";

        if(myString.equals("some text")) {

            System.out.println("Yes the text is the same!!");
            //do something
        }
        if(myString.length()==9) {
            System.out.println("The text is exactly 9 characters!!!");

            //do something
        }

        System.out.println(myString.charAt(myString.length()-1));



    }
}
