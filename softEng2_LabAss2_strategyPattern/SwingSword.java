package softEng2_LabAss2_strategyPattern;

public class SwingSword implements AttackStrategy
{
    public String attack()
    {
        String output = new String();
        output += " attacks with a sword!";

        return output;
    }
}
