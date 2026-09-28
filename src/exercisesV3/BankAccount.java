package exercisesV3;

public class BankAccount {

    //Attributsnamn: balance
    //datatyp:       int
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.balance = 0;
    }


    public int getBalance() {
        return balance;
    }

    //metodNamn:       getBalance
    //return datatyp:  int
    //värde:           balance


    //Utöka programmet så att man kan bestämma
    //ett nytt värde för saldo
    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    //metodNamn:       setBalance
    //return datatyp:  void
    //värde:           n/a
    //parameterNamn          newBalance
    //datatyp för parameter  int


    public void metodNamn() {
        //något vi gör
    }

    public void printBalance() {
        System.out.println("Saldot är: " + balance);
    }

    //Metod som sätter in pengar på vårt saldo
    //Dvs. ökar saldo med en viss summa
    public void deposit(int depositSum) {
        balance += depositSum;
    }

    //Metod som tar ut pengar från vårt saldo
    //Dvs. minskar saldo med en viss summa
    public void withdraw(int withdrawSum) {
        //OM balance blir mindre än 0 (withdrawSum > balance)
        if (withdrawSum <= balance) {
            balance -= withdrawSum;
        }
    }


}