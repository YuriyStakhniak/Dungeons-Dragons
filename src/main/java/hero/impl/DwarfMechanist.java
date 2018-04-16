package hero.impl;


import profession.Mechanist;
import race.Dwarf;

public class DwarfMechanist extends Dwarf implements Mechanist {

    @Override
    public String toString() {
        return ("Dwarf Mechanist " + this.getName() + "\n" +
                "------------------------" + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
