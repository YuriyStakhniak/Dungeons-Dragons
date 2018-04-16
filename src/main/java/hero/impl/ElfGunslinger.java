package hero.impl;


import profession.Gunslinger;
import race.Elf;

public class ElfGunslinger extends Elf implements Gunslinger {

    @Override
    public String toString() {
        return ("Elf Gunslinger " + this.getName() + "\n" +
                "------------------------" + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
