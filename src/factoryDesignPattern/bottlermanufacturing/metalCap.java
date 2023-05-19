package factoryDesignPattern.bottlermanufacturing;

public class metalCap extends CapManufacturing {

    @Override
    public void createCap() {
        System.out.println("100  metal cap created");
    }
}
