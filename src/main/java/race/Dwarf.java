package race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Dwarf {

    private boolean isLeader;
    private String name;
    private int charisma = 5, stamina = 45, intellect = 15, agility = 20, concentration = 5;

}
