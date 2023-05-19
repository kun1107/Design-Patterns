package factoryDesignPattern.bottlermanufacturing;

public class Client {

    public static void main(String[] args) {
        BottleCapFactory bottleCapFactory  = new BottleCapFactory();
        CapManufacturing capType = bottleCapFactory.createCap("Metal");
        CapManufacturing capType1 = bottleCapFactory.createCap("plastic");
    }
}
