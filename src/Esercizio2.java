import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un testo e premi invio");
        String testoUno = scanner.nextLine();
        System.out.println("Inserisci un testo e premi invio");
        String testoDue = scanner.nextLine();
        System.out.println("Inserisci un testo e premi invio");
        String testoTre = scanner.nextLine();
        System.out.println("Il testo inserito è:" + testoUno + " " + testoDue + " " + testoTre);
        scanner.close();
    }
}
