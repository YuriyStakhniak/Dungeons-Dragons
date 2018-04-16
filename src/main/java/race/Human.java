package race;

import hero.Unit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Human extends Unit implements HumanStats {
    private int charisma = HUMAN_CHARISMA;
    private int stamina = HUMAN_STAMINA;
    private int intellect = HUMAN_INTELLECT;
    private int agility = HUMAN_AGILITY;
    private int concentration = HUMAN_CONCENTRATION;
}
