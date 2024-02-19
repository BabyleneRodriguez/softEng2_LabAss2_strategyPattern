package softEng2_LabAss2_strategyPattern;

public class Knight implements CharacterType {
    SwingSword swingSwordAttack = new SwingSword();
    Shield knightShield = new Shield();
    Dodge knightDodge = new Dodge();
    CreateMagic knightMagic = new CreateMagic();

    public void attack()
    {
        System.out.println(swingSwordAttack.attack());
    }
    public void defend()
    {
        System.out.println("Knight" + knightShield.defense() + "\n" + "Knight" + knightDodge.defense() + "\n" + "Knight" + knightMagic.defense());
    }

    public void knightCharacter()
    {
        System.out.print ("Character : KNIGHT");
        System.out.print ("\nKnight");
        attack();
        defend();
        System.out.print ("\n");
    }
}
