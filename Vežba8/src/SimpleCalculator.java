import java.io.Console;
public class SimpleCalculator {

    /*   Napraviti jednostavan program koji ce preuzeti dva broja od korisnika pomoću klase Console
    *    i izvršiti njihovo sabiranje
  */
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter first operand:");
        String op1 = console.readLine();
        System.out.println("Enter second operand:");
        String  op2 = console.readLine();
        System.out.println("Result is:");
        System.out.println(Integer.parseInt(op1) + Integer.parseInt(op2));
    }
}