package softEng2_LabAss2_strategyPattern;

public class GameApp
{
    public static void main(String[] args)
    {
        {
            Knight knight = new Knight();
            knight.knightCharacter();

            Wizard wizard = new Wizard();
            wizard.wizardCharacter();

            Archer archer = new Archer();
            archer.archerCharacter();

        }
    }
}


