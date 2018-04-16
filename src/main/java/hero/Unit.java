package hero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Unit {
    private boolean isLeader;
    private String name;

    public abstract int getCharisma();

    public abstract void setCharisma(int charisma);

    public abstract int getStamina();

    public abstract void setStamina(int stamina);

    public abstract int getIntellect();

    public abstract void setIntellect(int intellect);

    public abstract int getAgility();

    public abstract void setAgility(int agility);

    public abstract int getConcentration();

    public abstract void setConcentration(int concentration);
}
