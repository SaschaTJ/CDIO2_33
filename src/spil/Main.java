package spil;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Når dit navn vises på skærmen, betyder det, at det er din tur.");
        System.out.println("Du skal nu kaste terningerne. For at gøre dette: Tryk ENTER");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast navn på spiller 1: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Indtast navn på spiller 2: ");
        Player player2 = new Player(scanner.nextLine());
        Player currentPlayer = new Player("current");
        Account player1Account = new Account();
        Account player2Account = new Account();



        for (boolean s1tur = true; player1Account.getScore() < 3000 && player2Account.getScore() < 3000; s1tur = !s1tur) {
            Account currentAccount;
            if (s1tur) {
                currentPlayer = player1;
                currentAccount = player1Account;
            } else {
                currentPlayer = player2;
                currentAccount = player2Account;
            }

            System.out.println(currentPlayer.getName() + " skal kaste terningerne");
            scanner.nextLine();

            Square square1 = new Square(player1Account,player2Account,currentAccount);
            square1.square();

            
        }

        System.out.println(currentPlayer.getName() + " har opnået 3000 point og vinder spillet.");
        scanner.close();
    }
}