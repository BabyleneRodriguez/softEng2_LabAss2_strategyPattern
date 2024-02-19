package softEng2_LabAss2_strategyPattern;

public class Character
{
    private CharacterStrategies character;
    public void attack()
    {
        character.attack();
    }
    public void defend()
    {
        character.defend();
    }
}

