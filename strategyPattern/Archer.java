package softEng2_LabAss2_strategyPattern;

public class Archer implements CharacterStrategies
{
    ShootArrow archerArrow = new ShootArrow();
    Dodge archerDodge = new Dodge();
    public void attack()
    {
        System.out.println (archerArrow.attack());
    }
    public void defend()
    {
        System.out.println (archerDodge.defense());
    }

    public void archerCharacter()
    {
        System.out.print ("Character : ARCHER");
        System.out.print ("\nArcher");
        attack();
        System.out.print ("Archer");
        defend();
        System.out.print ("\n");
    }
}
