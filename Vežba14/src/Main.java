public class Main {
    /*
    U program ulaze sledeći podaci: int x = 523134; i int y = 325423;
    Potrebno je izvršiti proveru ostatka deljenja x i y. Ukoliko ne postoji ostatak,
    prikazati poruku da ostatak ne postoji, u suprotnom proveriti da li je ostatak veći
    ili manji od 1000 i dati odgovarajuću poruku.

     */
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;

        if(x%y==0)
            System.out.println("Nema ostatka pri deljenju brojeva "+x+" i "+y);
           else if(x%y>1000) System.out.println("Ostatak pri deljenju brojeva " + x + " i " + y + " je veći od 1000!");
        else if(x%y<1000)
            System.out.println("Ostatak pri deljenju brojeva "+x+" i "+y+" je manji od 1000!");}}