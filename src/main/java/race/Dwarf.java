package race;

import hero.Unit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Dwarf extends Unit implements DwarfStats {
    private int charisma = DWARF_CHARISMA;
    private int stamina = DWARF_STAMINA;
    private int intellect = DWARF_INTELLECT;
    private int agility = DWARF_AGILITY;
    private int concentration = DWARF_CONCENTRATION;
}
