import java.util.Scanner;

public class Main {
    /*
        Potrebno je kreirati program koji će prikazati rezultat računske operacije na osnovu tri
        informacije koje u njega ulaze: String operator, double operand1 i double operand2 i koristiti
        switch/case.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Unesite željenu računsku operaciju: ");
        String operator = scanner.nextLine();

        System.out.println("Unesite drugi broj: ");
        double operand2 = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case "*":
                System.out.println("Rezultat je: " + (operand1 * operand2));
                break;
            case "/":
                System.out.println("Rezultat je: " + (operand1 / operand2));
                break;
            case "+":
                System.out.println("Rezultat je: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Rezultat je: " + (operand1 - operand2));
                break;
        }
    }
}