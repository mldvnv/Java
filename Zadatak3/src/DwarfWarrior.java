public class DwarfWarrior extends BaseHero {


    public double rage;

    public DwarfWarrior (double health, double rage){
        this.health=health;
        this.rage=rage;
        this.isDead=false;
        System.out.println("Kreiran je heroj Dwarf Warrior sledećih karakteristika:");
        show();
        System.out.println();
    }

    @Override
    public void receiveHit() {
        this.health -=10;
        System.out.println("Warrior suffers damage and enrages!!!");
        this.rage +=15;
        this.isDead=this.health<=0;
        show();
    }

    @Override
    public void primaryFire() {
        if (this.isDead==false){
            System.out.println("Warrior swinging his primary weapon!");
            this.rage -= 5;
            show();
        }

    }

    @Override
    public void secondaryFire() {
        if (this.isDead==false){
            System.out.println("Warrior swinging his secondary weapon!");
            this.rage -= 10;
            show();
        }

    }


    @Override
    public void show() {
        System.out.println("Dwarf Warrior> Health: "+this.health+" Rage: "+this.rage+" is dead?: "+this.isDead);
    }
}
