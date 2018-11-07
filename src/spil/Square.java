package spil;

public class Square {

//Creates objects from the other classes
     Dice sum1 = new Dice();
    Account player1Account;
    Account player2Account;
    Account currentAccount;

// We make a constuctor.

    public Square( Account player1Account, Account player2Account, Account currentAccount) {
        this.player1Account = player1Account;
        this.player2Account = player2Account;
        this.currentAccount = currentAccount;
    }

    public void square() {

       sum1.throwDice();

// Switch methode to land on a new square from turn to turn.

       switch (sum1.totalSum()) {
           case 2:
               System.out.println("Du indtager tårnet og tager dens skat til en værdi af 250!");
               currentAccount.addToScore(250);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 3:
               System.out.println("Du falder i krateret og taber 100...");
               currentAccount.addToScore(-100);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 4:
               System.out.println("Du modtager 100 for at træde ind ad paladsets port");
               currentAccount.addToScore(100);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 5:
               System.out.println("Du er endt i den kolde ørken og 20 af dine monz fryser væk");
               currentAccount.addToScore(-20);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 6:
               System.out.println("Du modtages i Wall City med 180");
               currentAccount.addToScore(180);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 7:
               System.out.println("Du sidder en runde over i klosteret.");
               System.out.println("");
               break;
           case 8:
               System.out.println("Du mister 70 monz i den sorte hule. Øv.");
               currentAccount.addToScore(-70);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 9:
               System.out.println("Du støder på en lejr i bjergene og finder 60 penge i et telt");
               currentAccount.addToScore(60);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 10:
               System.out.println("Du rammer the Werewolf Track og mister 80. Du får dog en ny tur");
               currentAccount.addToScore(-80);
               System.out.println(currentAccount.getScore());
               System.out.println("");
           case 11:
               System.out.println("Du falder i hullet og det koster dig 50 at komme op igen");
               currentAccount.addToScore(-50);
               System.out.println(currentAccount.getScore());
               System.out.println("");
               break;
           case 12:
               System.out.println("Du har fundet guld i bjergene og sælger det for 650!");
               currentAccount.addToScore(650);
               System.out.println(currentAccount.getScore());
               System.out.println("");
       }
   }

}
