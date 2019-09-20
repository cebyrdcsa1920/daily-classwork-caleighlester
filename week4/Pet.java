import java.awt.Color;

public class Pet
{
    private String species;
    private Color color;
    private int age;
    private double weight;
    private String name;

    public Pet()
    {
        species = "Albino Corn Snake";
        color = Color.WHITE;
        age = 1;
        weight = .5;
        name = "Draco";
    }

    public void rename(String newName)
    {

    }

    public Pet(String species, Color color, int age, double weight, String name)
    {
        this.species = species
        this.color = color
        this.age = age
        this.weight = weight
        this.name = name
    }
}