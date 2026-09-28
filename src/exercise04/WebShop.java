package exercise04;

import java.util.Scanner;

public class WebShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ditt användarnamn och lösenord");

        //spara användarnamn och lösenord från användaren
        String userName = scan.nextLine();
        String password = scan.nextLine();
        User user = new User(userName, password);

        System.out.println("Skriv in ditt nya användarnamn och lösenord");

        String newUserName = scan.nextLine();
        user.setUserName(newUserName);

        String newPassword = scan.nextLine();
        user.setPassword(newPassword);

        //skriv ut nytt användarnamn och lösenord

        System.out.println("Ditt nya användarnamn är: " +user.getUserName());
        System.out.println("Ditt nya lösenord är: " +user.getPassword());

    }

}
