package util;


import hero.Unit;
import hero.impl.*;


public class AppMenu {

    private static final int MIN_MENU_INPUT = 1;
    private static final int MAX_MENU_INPUT = 6;

    public static void printWelcomeMessage() {
        System.out.println("Hello! Welcome to Good Old Quest\n");
        System.out.println("Now you have to create a squadron of 3 heroes\n");
    }

    public static void printHeroesVariants() {
        System.out.println("Please choose a hero \n press 1 for Human Priest\n " +
                "press 2 for Human Paladin\n press 3 for Dwarf Warrior\n " +
                "press 4 for Dwarf Mechanist\n press 5 for Elf Mage\n press 6 for Elf Gunslinger");
    }

    public static void heroChoosing() {
        while (ScannerUtil.getScanner().hasNext()) {
            int input = ScannerUtil.getInt();
            if (input > MAX_MENU_INPUT || input < MIN_MENU_INPUT) {
                System.out.println("Choose from 1 to 6");
            } else {
                switch (input) {
                    case 1:
                        humanPriestInit();
                        break;
                    case 2:
                        humanPaladinInit();
                        break;
                    case 3:
                        dwarfWarriorInit();
                        break;
                    case 4:
                        dwarfMechanistInit();
                        break;
                    case 5:
                        elfMageInit();
                        break;
                    case 6:
                        elfGunslingerInit();
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private static void setHeroStats(Unit unit) {
        setHeroName(unit);
        setHeroCharisma(unit);
        setHeroStamina(unit);
        setHeroIntellect(unit);
        setHeroAgility(unit);
        setHeroConcentration(unit);
    }

    private static void setHeroName(Unit unit) {
        System.out.println("Set hero name");
        String name = ScannerUtil.getString();
        unit.setName(name);
    }

    private static void setHeroCharisma(Unit unit) {
        System.out.println("Set hero Charisma. (Basic " + unit.getClass().getSimpleName() +
                " Charisma = " + unit.getCharisma() + ")");
        unit.setCharisma(unit.getCharisma() + ScannerUtil.getInt());
    }

    private static void setHeroStamina(Unit unit) {
        System.out.println("Set hero Stamina. (Basic " + unit.getClass().getSimpleName() +
                " Stamina = " + unit.getStamina() + ")");
        unit.setStamina(unit.getStamina() + ScannerUtil.getInt());
    }

    private static void setHeroIntellect(Unit unit) {
        System.out.println("Set hero Intellect. (Basic " + unit.getClass().getSimpleName() +
                " Intellect = " + unit.getIntellect() + ")");
        unit.setIntellect(unit.getIntellect() + ScannerUtil.getInt());
    }

    private static void setHeroAgility(Unit unit) {
        System.out.println("Set hero Agility. (Basic " + unit.getClass().getSimpleName() +
                " Agility = " + unit.getAgility() + ")");
        unit.setAgility(unit.getAgility() + ScannerUtil.getInt());
    }

    private static void setHeroConcentration(Unit unit) {
        System.out.println("Set hero Concentration. (Basic " + unit.getClass().getSimpleName() +
                " Concentration = " + unit.getCharisma() + ")");
        unit.setConcentration(unit.getConcentration() + ScannerUtil.getInt());
    }

    private static void elfGunslingerInit() {
        Unit unit = new ElfGunslinger();
        setHeroStats(unit);
        System.out.println(unit);
    }

    private static void humanPriestInit() {
        Unit unit = new HumanPriest();
        setHeroStats(unit);
        System.out.println(unit);
    }

    private static void humanPaladinInit() {
        Unit unit = new HumanPaladin();
        setHeroStats(unit);
        System.out.println(unit);
    }

    private static void dwarfWarriorInit() {
        Unit unit = new DwarfWarrior();
        setHeroStats(unit);
        System.out.println(unit);
    }

    private static void dwarfMechanistInit() {
        Unit unit = new DwarfMechanist();
        setHeroStats(unit);
        System.out.println(unit);
    }

    private static void elfMageInit() {
        Unit unit = new ElfMage();
        setHeroStats(unit);
        System.out.println(unit);
    }
}