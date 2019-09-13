public class CarRunner
{
    public static void main(String [] args)
    {
        Car myCamaro = new Car();
        System.out.println(myCamaro);
        myCamaro.drive(5.5);
        System.out.println(myCamaro.getAmountOfGas());
        myCamaro.drive(100.5);
        System.out.println(myCamaro.getAmountOfGas());
        myCamaro.fillUpTank(9);
        System.out.println(myCamaro.getAmountOfGas());
        Car myJeep = new Car();

    }
}