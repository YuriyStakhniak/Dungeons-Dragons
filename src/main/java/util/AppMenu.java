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

    public static void printHeroStartStats(Unit unit) {
        if (unit.getClass().equals(ElfGunslinger.class)) {
            printStartElfStats();
        } else if (unit.getClass().equals(ElfMage.class)) {
            printStartElfStats();
        } else if (unit.getClass().equals(HumanPaladin.class)) {
            printStartHumanStats();
        } else if (unit.getClass().equals(HumanPriest.class)) {
            printStartHumanStats();
        } else if (unit.getClass().equals(DwarfMechanist.class)) {
            printStartDwarfStats();
        } else if (unit.getClass().equals(DwarfWarrior.class)) {
            printStartDwarfStats();
        } else System.out.println("There is no such hero");
    }

    public static void printStartElfStats() {
        System.out.println("Hero start stats are...\ncharisma = 15\nstamina = 10\nintellect = 25\nagility = 22\n" +
                "concentration = 18;");
    }

    public static void printStartHumanStats() {
        System.out.println("Hero start stats are...\ncharisma = 10\nstamina = 30\nintellect = 20\nagility = 15\n" +
                "concentration = 18;");
    }

    public static void printStartDwarfStats() {
        System.out.println("Hero start stats are...\ncharisma = 5\nstamina = 45\nintellect = 15\nagility = 20\n" +
                "concentration = 5;");
    }

    public static void heroChoosing(){
        int input = ScannerUtil.getInt();
        if(input == 1){
            Unit unit = new HumanPriest();
            printHeroStartStats(unit);
            setHeroStats(unit);
            printHeroStats(unit);
        }else if(input == 2){
            Unit unit = new HumanPaladin();
            printHeroStartStats(unit);
            setHeroStats(unit);
            printHeroStats(unit);
        }else if(input == 3){
            Unit unit = new DwarfWarrior();
            printHeroStartStats(unit);
            setHeroStats(unit);
            printHeroStats(unit);
        }else if(input == 4){
            Unit unit = new DwarfMechanist();
            printHeroStartStats(unit);
            setHeroStats(unit);
            printHeroStats(unit);
        }else if(input == 5){
            Unit unit = new ElfMage();
            printHeroStartStats(unit);
            setHeroStats(unit);
            printHeroStats(unit);
        }else if(input == 6){
            Unit unit = new ElfGunslinger();
            printHeroStartStats(unit);
            setHeroStats(unit);
            printHeroStats(unit);
        }else System.out.println("Invalid input");
    }

    public static int getAdditionalPoint(){
        int additionalPoint = ScannerUtil.getInt();
        return additionalPoint;
    }

    public static void setHeroStats(Unit unit){
        System.out.println("Add from 1 to 10 additional points to charisma");
        setHeroCharisma(unit, getAdditionalPoint());
        System.out.println("Add from 1 to 10 additional points to stamina");
        setHeroStamina(unit, getAdditionalPoint());
        System.out.println("Add from 1 to 10 additional points to intellect");
        setHeroIntellect(unit, getAdditionalPoint());
        System.out.println("Add from 1 to 10 additional points to agility");
        setHeroAgility(unit, getAdditionalPoint());
        System.out.println("Add from 1 to 10 additional points to concentration");
        setHeroConcentration(unit, getAdditionalPoint());
    }

    public static void printHeroStats(Unit unit){
        System.out.println("charisma = " + unit.getCharisma() + "\n"
               + "stamina = " + unit.getStamina()+ "\n"
                + "intellect = " + unit.getIntellect()+ "\n"
                + "agility = " + unit.getAgility()+ "\n"
                + "concentration = " + unit.getConcentration()+ "\n");
    }

    public static void setHeroCharisma(Unit unit, int additionalPoint){
        unit.setCharisma(unit.getCharisma() + additionalPoint);
    }
    public static void setHeroStamina(Unit unit, int additionalPoint){
        unit.setStamina(unit.getStamina() + additionalPoint);
    }
    public static void setHeroIntellect(Unit unit, int additionalPoint){
        unit.setIntellect(unit.getIntellect() + additionalPoint);
    }
    public static void setHeroAgility(Unit unit, int additionalPoint){
        unit.setAgility(unit.getAgility() + additionalPoint);
    }
    public static void setHeroConcentration(Unit unit, int additionalPoint){
        unit.setConcentration(unit.getConcentration() + additionalPoint);
    }

}