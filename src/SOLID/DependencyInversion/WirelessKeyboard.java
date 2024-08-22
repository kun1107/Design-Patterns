package SOLID.DependencyInversion;

public class WirelessKeyboard implements Keyboard {
    @Override
    public void keyboardFunction() {
        System.out.println("wireless keyboard");
    }
}
