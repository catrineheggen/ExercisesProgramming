package veckouppgiftVecka3;

public class SpellingGame {
    private int score;

    public int getScore() {  // Metod
        return score;
    }

    public void newScore() {
        score = score + 1;
    }

    public void checkWord(String userAnswer, String correctWord){
        if (userAnswer.equals(correctWord)){
            newScore();
        }
    }

}
