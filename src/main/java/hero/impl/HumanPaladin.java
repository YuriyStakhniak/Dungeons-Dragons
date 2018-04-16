package hero.impl;


import profession.Paladin;
import race.Human;

public class HumanPaladin extends Human implements Paladin {

    @Override
    public String toString() {
        return ("Human Paladin " + this.getName() + "\n" +
                "------------------------" + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
