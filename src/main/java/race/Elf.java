package race;

import hero.Unit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Elf extends Unit implements ElfStats {
    private int charisma = ELF_CHARISMA;
    private int stamina = ELF_STAMINA;
    private int intellect = ELF_INTELLECT;
    private int agility = ELF_AGILITY;
    private int concentration = ELF_CONCENTRATION;
}
