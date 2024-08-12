public class Main {

    /*  Potrebno je kreirati program za naplatu kreditnih kartica. U programu postoji metod koji prihvata objekat
        klase Card. Klasa Card ima konstruktor koji kao parametar prihvata inicijalno stanje na računu. Klasa Card
        ima polje balance i metod charge. Metod charge proverava da li na kartici ima dovoljno novca i ukoliko ima
        izvršava naplatu. Ukoliko nema, prikazuje korisniku da ne postoji dovoljno sredstava na računu i otkazuje
        naplatu.
*/

    public static void main(String[] args) {
        Card c = new Card(2500);
        naplati(c,1000);
        naplati(c,250);
        naplati(c,1500);

    }
    public static void naplati(Card c,double iznos){
        c.charge(iznos);

    }
}