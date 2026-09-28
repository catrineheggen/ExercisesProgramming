package smallExercisesV1;

public class Exercise42 {
    static void main(String[] args) {

        //En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För
        //första dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv. Lönen
        //fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen
        //måste arbeta för att tjäna en miljon kronor.

        int totalSalary = 1;

        int salary = 1;

        int days = 1;

        // 1 000 000 00

        while (totalSalary < 100000000) {
            salary *= 2;
            days++;
            totalSalary += salary;

            System.out.println("Number: " + salary);
            System.out.println("Total: " + totalSalary);
        }

        System.out.println("Days: " + days);
    }
}


