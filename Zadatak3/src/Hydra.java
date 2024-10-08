public class Hydra extends BaseHero {


    public Hydra (){
        this.health=100;
        this.mana=100;
        this.isDead=false;
        System.out.println("Kreiran je protivnik Hydra sledećih karakteristika:");
        show();
        System.out.println();
    }


    @Override
    public void receiveHit() {
        if (this.isDead==false) {
            this.health -= 15;
            System.out.println("Hydra suffers damage!!!");
            this.mana += 10;
            this.isDead = this.health <= 0;
            show();
        }
    }


    @Override
    public void primaryFire() {
        if (this.isDead==false) {
            System.out.println("Hydra uses her jaws of fury!");
            this.mana -= 15;
            this.health += 5;
            show();
        }
    }

    @Override
    public void secondaryFire() {
        if (this.isDead==false) {
            System.out.println("Hydra uses her socks of death and destruction!");
            this.mana -= 20;
            this.health += 5;
            show();
        }
    }

    @Override
    public void show() {
        System.out.println("Hydra> Health: "+this.health+" Mana: "+this.mana+" is dead?: "+this.isDead);
    }
}

