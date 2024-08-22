package SOLID.DependencyInversion;

import java.security.Key;

public class WiredKeyboard implements Keyboard {
    @Override
    public void keyboardFunction() {
        System.out.println("wired keyboard");
    }
}
