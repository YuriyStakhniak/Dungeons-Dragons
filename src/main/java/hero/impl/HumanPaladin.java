package hero.impl;


import hero.Unit;
import profession.Paladin;
import race.Human;

public class HumanPaladin extends Human implements Paladin, Unit {

    @Override
    public String toString() {
        return ("Human Paladin " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
