import java.util.Scanner;

public class Rectangle extends Shape{
    public double a;
    public double b;

    public Rectangle(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu a pravougaonika: ");
        this.a = scanner.nextDouble();
        System.out.println("Unesite stranicu b pravougaonika: ");
        this.b = scanner.nextDouble();
        perimeter();
        area();
    }

    @Override
    public void perimeter() {
        System.out.println("Obim pravougaonika čije su stranice "+this.a+" i "+this.b+" je: "+(2*this.a+2*this.b));
    }

    @Override
    public void area() {
        System.out.println("Površina pravougaonika čije su stranice "+this.a+" i "+this.b+" je: "+(this.a*this.b));
    }
}
