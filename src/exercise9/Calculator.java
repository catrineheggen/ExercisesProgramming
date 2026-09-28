package exercise9;

public class Calculator {
    //attribut
    private int first, second;
    //konstruktor
    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;

    }

    public int add() {
        return first + second;

    }
}
