import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public Car()
    {
        model = "Camaro";
        color = Color.YELLOW;
        numPassengers = 2;
        amountOfGas = 12.5;
        mpg = 15.0;
    }

        /**
         * drives the car the given distance. Subtracts gas from the tank.
         *
         * @param distance The distance druven in miles
         */
        public void drive(double distance)
        {
            amountOfGas = distance / mpg;
        }

        public double getAmountOfGas()
        {
            return amountOfGas;
        }

    public String toString()
    {
        return "This is my Camaro";

    }

}
