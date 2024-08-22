package SOLID.LiskovSubstitution;

public class Motorcycle implements Bike{
    @Override
    public boolean turnOnEngine() {
        return true;
    }

    @Override
    public int increaseSpeed(int speed) {
        return speed + 10;
    }
}
