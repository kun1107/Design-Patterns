package SOLID.LiskovSubstitution;

public class BiCycle implements Bike{
    @Override
    public boolean turnOnEngine() {
        throw new RuntimeException("No Engine");
    }

    @Override
    public int increaseSpeed(int speed) {
        return speed + 1;
    }
}
