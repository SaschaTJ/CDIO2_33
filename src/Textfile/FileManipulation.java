package Textfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManipulation {
    public static void main(String[] args) {
        String str = null;
        try {
            FileManipulation filemanipulation = new FileManipulation();
            filemanipulation.writeFile();
            filemanipulation.readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile() throws Exception {
        //Husk n, så bliver hver besked udskrevet på hver sin linje.
        String str =
                " Når dit navn vises på skærmen, betyder det, at det er din tur.\n"+
                " Du skal nu kaste terningerne. For at gøre dette: Tryk ENTER\n" +
                " Indtast navn på spiller 1:\n" +
                " Indtast navn på spiller 2:\n" +
                " skal kaste terningerne\n" +
                " har opnået 3000 point og vinder spillet.\n" +
                " Du indtager tårnet og tager dens skat til en værdi af 250!\n" +
                " Du falder i krateret og taber 100...\n" +
                " Du modtager 100 for at træde ind ad paladsets port\n" +
                " Du er endt i den kolde ørken og 20 af dine monz fryser væk\n" +
                " Du modtages i Wall City med 180\n" +
                " Du sidder en runde over i klosteret.\n" +
                " Du mister 70 monz i den sorte hule. Øv.\n" +
                " Du støder på en lejr i bjergene og finder 60 penge i et telt\n" +
                " Du rammer the Werewolf Track og mister 80. Du får dog en ny tur\n" +
                " Du falder i hullet og det koster dig 50 at komme op igen\n" +
                " Du har fundet guld i bjergene og sælger det for 650!\n";

        String mitFilnavn = "CDIODK.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(mitFilnavn));
        writer.write(str); //Skriver streng til filen
        writer.newLine();   //Skriver ny linje til filen
        writer.close();

    }

    public void readFile() throws Exception {
        String file = "CDIOENG.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str = "";
        String currentLine = reader.readLine();  //Læs en linje
        while (currentLine != null) {
            System.out.println(currentLine);
            currentLine = reader.readLine();
        }
        reader.close();
    }

}

//Lavet af Sascha