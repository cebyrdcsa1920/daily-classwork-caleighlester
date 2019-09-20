import java.awt.Color

public class Child
{
    private String name;
    private Color race;
    private String gender;
    private int arms;
    private int legs;
    private double IQ;

    public Child()
    {
        name = "Eloise She'lice Lester-Richardson";
        race = Color.BROWN;
        gender = "Girl";
        arms = 2;
        legs = 2;
        IQ = 135.8;
    }

     public Child(String name, Color race, String gender,int arms, int legs, double IQ)
     {
         this.name = name
         this.race = race
         this.gender = gender
         this.arms = arms
         this.legs = legs
         this.IQ = IQ
     }
}
