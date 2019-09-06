public class CarRunner
{
    public static void main(String [] args)
    {
        Car myCamaro = new Car();
        System.out.println(myCamaro);
        myCamaro.drive(5.5);
        System.out.println(myCamaro.getAmountOfGas());
    }
}