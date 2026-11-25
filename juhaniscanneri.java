import java.util.Scanner;

public class juhaniscanneri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä Nimesi: ");
        String nimi = scanner.nextLine();

        scanner.close();
    }
}