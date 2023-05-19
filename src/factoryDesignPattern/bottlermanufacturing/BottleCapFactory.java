package factoryDesignPattern.bottlermanufacturing;

//*implementation details are not available for client*/
public class BottleCapFactory {

    public CapManufacturing createCap(String capType){

        switch (capType) {
            case ("Metal"):
                return new metalCap();
            case("plastic"):
                return new plasticCap();
            default:
                return null;

        }

    }
}
