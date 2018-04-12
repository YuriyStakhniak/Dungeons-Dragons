package race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Human {

    private boolean isLeader;
    private String name;
    private int charisma = 10, stamina = 30, intellect = 20, agility = 15, concentration = 15;
}
