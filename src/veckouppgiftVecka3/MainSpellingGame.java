package veckouppgiftVecka3;

import java.util.Scanner;

public class MainSpellingGame {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SpellingGame spellingGame = new SpellingGame();

        System.out.println("katt");
        String text = scan.nextLine();
        spellingGame.checkWord(text, "katt");

        System.out.println("hund");
        text = scan.nextLine();
        spellingGame.checkWord(text, "hund");

        System.out.println("hus");
        text = scan.nextLine();
        spellingGame.checkWord(text, "hus");

        System.out.println("Du fick " + spellingGame.getScore() + " poäng av 3.");





    }
}