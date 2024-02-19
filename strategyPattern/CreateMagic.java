package softEng2_LabAss2_strategyPattern;

public class CreateMagic implements DefenseStrategy
{
    public String defense()
    {
        String output = new String();
        output += " creating a magic barrier for defense!";

        return output;
    }
}
