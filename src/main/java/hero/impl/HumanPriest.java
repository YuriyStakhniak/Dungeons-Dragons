package hero.impl;


import hero.Unit;
import profession.Priest;
import race.Human;

public class HumanPriest extends Human implements Priest, Unit {

    @Override
    public String toString() {
        return ("Human Priest " + this.getName() + "\n" +
                "------------------------" + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
