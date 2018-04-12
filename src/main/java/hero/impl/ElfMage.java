package hero.impl;


import hero.Unit;
import profession.Mage;
import race.Elf;

public class ElfMage extends Elf implements Mage, Unit {

    @Override
    public String toString() {
        return ("Elf Mage " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
