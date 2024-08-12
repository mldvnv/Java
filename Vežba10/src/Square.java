import java.util.Scanner;

public class Square extends Shape{
    public double a;

    public Square(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu kvadrata: ");
        this.a = scanner.nextDouble();
        perimeter();
        area();
    }

    @Override
    public void perimeter() {
        System.out.println("Obim kvadrata čija je stranica "+this.a+" je: "+(4*this.a));
    }

    @Override
    public void area() {
        System.out.println("Površina kvadrata čija je stranica "+this.a+" je: "+(this.a*this.a));
    }
}
