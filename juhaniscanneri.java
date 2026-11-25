import java.util.Scanner;

public class juhaniscanneri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Syota Nimesi: ");
        String nimi = scanner.nextLine();

        System.out.print("Syota Ikäsi: ");
        int ika = scanner.nextInt();

        System.out.println("Mika on keskiarvosi: ");
        double keskiarvo = scanner.nextDouble();

        System.out.print("Oletko opiskelija? (kylla/ei): ");
        boolean isOppilas = scanner.nextBoolean();

        System.out.println("Morjens " + nimi);
        System.out.println("Sinä olet " + ika + " vuotta vanha");
        System.out.println("Sinun keskiarvosi on: " + keskiarvo);

        scanner.close();
    }
}