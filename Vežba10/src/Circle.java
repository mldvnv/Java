import java.util.Scanner;
public class Circle extends Shape{
    public double r=8;
    public final double PI=3.14;

    public Circle(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite poluprečnik kruga: ");
        this.r = scanner.nextDouble();
        perimeter();
        area();
    }

    @Override
    public void perimeter() {
        System.out.println("Obim kruga čiji je poluprečnik "+this.r+" je: "+(2*this.r*this.PI));
    }

    @Override
    public void area() {
        System.out.println("Površina kruga čiji je poluprečnik "+this.r+" je: "+(this.r*this.r*this.PI));
    }

    public void show(){
        System.out.println("Ovo je krug!");
    }

    public void show(String color){
        System.out.println("Ovo je krug u boji: "+color);
    }

    public void show(String color, String name){
        System.out.println("Ovo je krug u boji "+color+" i zove se: "+name);
    }

}
