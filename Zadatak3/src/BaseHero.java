public abstract class BaseHero {

    public double health, mana;
    public boolean isDead;

    //metoda za opis ponašanja kada heroj biva napadnut i trpi štetu koja je raspoređena na određenoj površini
    public void areaOfEffect(){
        receiveHit();
    }

    //apstraktna metoda za opis ponašanja kada heroj biva napadnut i trpi štetu
    public abstract void receiveHit();

    //apstraktna metoda za opis ponašanja kada heroj napada primarnim oružjem ili veštinom
    public abstract void primaryFire();

    //apstraktna metoda za opis ponašanja kada heroj napada sekindarnim oružjem ili veštinom
    public abstract void secondaryFire();

    //apstraktna metoda koja ispisuje trenutne parametre heroja
    public abstract void show();


}
