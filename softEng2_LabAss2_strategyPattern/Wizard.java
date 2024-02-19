package softEng2_LabAss2_strategyPattern;

public class Wizard implements CharacterType
{
    CastSpell wizardCastSpell = new CastSpell();
    CreateMagic wizardCreateMagic = new CreateMagic();
    public void attack()
    {
       System.out.println (wizardCastSpell.attack());
    }
    public void defend()
    {
        System.out.println (wizardCreateMagic.defense());
    }

    public void wizardCharacter()
    {
        System.out.print ("Character : WIZARD");
        System.out.print ("\nWizard");
        attack();
        System.out.print ("Wizard");
        defend();
        System.out.print ("\n");
    }
}
