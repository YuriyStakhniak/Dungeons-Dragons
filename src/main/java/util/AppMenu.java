package util;


import hero.Unit;
import hero.impl.*;


public class AppMenu {

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
        int input = ScannerUtil.getInt();
        if (input == 1) {
            Unit unit = new HumanPriest();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 2) {
            Unit unit = new HumanPaladin();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 3) {
            Unit unit = new DwarfWarrior();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 4) {
            Unit unit = new DwarfMechanist();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 5) {
            Unit unit = new ElfMage();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 6) {
            Unit unit = new ElfGunslinger();
            setHeroStats(unit);
            System.out.println(unit);
        } else System.out.println("Invalid input");
    }

    private static void setHeroStats(Unit unit) {
        System.out.println("Set hero name");
        String name = ScannerUtil.getString();
        unit.setName(name);
        System.out.println("Set hero Charisma");
        unit.setCharisma(unit.getCharisma() + ScannerUtil.getInt());
        System.out.println("Set hero Stamina");
        unit.setStamina(unit.getStamina() + ScannerUtil.getInt());
        System.out.println("Set hero Intellect");
        unit.setIntellect(unit.getIntellect() + ScannerUtil.getInt());
        System.out.println("Set hero Stamina");
        unit.setAgility(unit.getAgility() + ScannerUtil.getInt());
        System.out.println("Set hero Agility");
        unit.setConcentration(unit.getConcentration() + ScannerUtil.getInt());
    }
}