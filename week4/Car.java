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
        public Car(String model, Color color, int numPassangers, double amountOfGas, double mpg)
        {
            this.model = model;
            this.color = color;
            this.numPassangers = numPassangers;
            this.amountOfGas = amountOfGas;
            this.mpg = mpg;
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

        /**
         *
         * @param amount of gas to add to tank
         */

        public void fillUpTank(double amount)
        {
            amountOfGas +=amount;
        }

        /**
         * Gets the amount of gas in the tank
         *
         *@return the amount of gas
         */

        public double getAmountOfGas()
        {
            return amountOfGas;
        }

    public String toString()
    {
        return "This is my Camaro";

    }

}
