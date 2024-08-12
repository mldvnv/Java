public class Main {

   /*Potrebno je napraviti klasu Shape koja bi sadržala neke podatke o geometrijskom obliku: poziciju(x,y),
     boju i naziv. Potrebno je napraviti tri klase koje nasleđuju ovu klasu, jednu za krug, jednu za
     kvadrat i jednu za pravougaonik. Svaka treba da sadrži metodu za izračunavanje površine, obima kao i
     sopstvene atribute koji su neophodni za ovo izračunavanje (strane za pravougaonik, kvadrat i
     poluprečnik za krug). Krug takodje treba da poseduje konstantu PI.
    */


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.show();
        circle.show("Red");
        circle.show("Blue", "Zdravko");
        System.out.println();
        Square square = new Square();
        square.show();
        System.out.println();
        Rectangle rectangle = new Rectangle();
        rectangle.show();

    }
}