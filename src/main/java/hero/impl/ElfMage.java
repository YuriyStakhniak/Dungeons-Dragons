package hero.impl;


import profession.Mage;
import race.Elf;

public class ElfMage extends Elf implements Mage {

    @Override
    public String toString() {
        return ("Elf Mage " + this.getName() + "\n" +
                "------------------------" + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
