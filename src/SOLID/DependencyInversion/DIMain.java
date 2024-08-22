package SOLID.DependencyInversion;

public class DIMain {

    public static void main(String[] args) {
        Macbook macbook = new Macbook(new WiredKeyboard(), new WirelessMouse());

        macbook.getKeyboardAndMouseDetails();
    }



}
