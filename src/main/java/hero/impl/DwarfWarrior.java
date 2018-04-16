package hero.impl;


import profession.Warrior;
import race.Dwarf;

public class DwarfWarrior extends Dwarf implements Warrior {

    @Override
    public String toString() {
        return ("Dwarf Warrior " + this.getName() + "\n" +
                "------------------------" + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
