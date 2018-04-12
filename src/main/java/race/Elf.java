package race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Elf {

    private boolean isLeader;
    private String name;
    private int charisma = 15, stamina = 10, intellect = 25, agility = 22, concentration = 18;
}
