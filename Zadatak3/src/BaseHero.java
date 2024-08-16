public abstract class BaseHero {

    public double health, mana;
    public boolean isDead;

    public void areaOfEffect(){
        receiveHit();
    }

    public abstract void receiveHit();

    public abstract void primaryFire();

    public abstract void secondaryFire();

    public abstract void show();


}
