public class ElfMage extends BaseHero {

    public ElfMage (double health, double mana){
        this.health=health;
        this.mana=mana;
        this.isDead=false;
        System.out.println("Kreiran je heroj Elf Mage sledećih karakteristika:");
        show();
        System.out.println();
    }


    @Override
    public void receiveHit() {
        if (this.isDead==false){
            this.health -=30;
            System.out.println("Mage sufferes damage!!!");
            this.isDead=this.health<=0;
        }

        show();
    }

    @Override
    public void primaryFire() {
        if (this.isDead==false) {
            System.out.println("Mage uses his primary spell!");
            this.mana -= 15;
            show();
        }
    }


    @Override
    public void secondaryFire() {
        if (this.isDead==false) {
            System.out.println("Mage uses his secondary spell!");
            this.mana -= 50;
            show();
        }
    }

    @Override
    public void show() {
        System.out.println("Elf Mage> Health: "+this.health+" Mana: "+this.mana+" is dead?: "+this.isDead);
    }
}

