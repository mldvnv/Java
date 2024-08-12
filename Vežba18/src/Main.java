import java.util.Random;
public class Main {
    /*
    Potrebno je kreirati niz stringova koji sadrži sledeće stringove: Heart,Cherry,Coin,Melon,Joker
    U nastavku programa treba kreirati sistem za generisanje kombinacija. Potrebno je da program
    prikaže dobijenu kombinaciju znakova na izlazu u sledećem formatu:
    Combination is:
    Joker Melon Melon Heart Coin
     */

    public static void main(String[] args) {
        String[] niz = {"Heart","Cherry","Coin","Melon","Joker"};
        System.out.println("Combination is:");
        for (int i =0;i<niz.length;i++){
            Random r = new Random();
            int rand = r.nextInt(niz.length);
            System.out.print(" "+niz[rand]);
        }
    }
}