import java.util.Scanner;
public class Main {
//    Napraviti program koji pita koisnika za unos jednog broja , zatim za unos drugog broja
//    i ispisuje njihov zbir u konzoli
//
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Unesite prvi broj: ");
            int prviBroj = scanner.nextInt();

            System.out.println("Unesite drugi broj: ");
            int drugiBroj = scanner.nextInt();

            int rezultat = prviBroj+drugiBroj;
            System.out.println("Zbir je: "+rezultat);
        }
}
