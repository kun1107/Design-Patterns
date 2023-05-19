package factoryDesignPattern.bottlermanufacturing;

public class plasticCap extends CapManufacturing {

    @Override
    public void createCap() {
        System.out.println("100 cap plastic Cap created");
    }
}
