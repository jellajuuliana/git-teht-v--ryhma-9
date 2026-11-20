import java.util.Scanner;

public class tervehdys {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä sinun nimesi on? ");
        String nimi = lukija.nextLine();

        System.out.println("Hei " + nimi + "!");
    

        lukija.close();
    }
}