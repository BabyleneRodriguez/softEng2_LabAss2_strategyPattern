package softEng2_LabAss2_strategyPattern;

public class Shield implements DefenseStrategy
{
    public String defense()
    {
        String output = new String();
        output += " using a shield to defend!";

        return output;
    }
}
