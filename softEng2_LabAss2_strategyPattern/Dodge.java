package softEng2_LabAss2_strategyPattern;

public class Dodge implements DefenseStrategy
{
    public String defense()
    {
        String output = new String();
        output += " dodgin to avoid attack!";

        return output;
    }
}
