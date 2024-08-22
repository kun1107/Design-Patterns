package SOLID.DependencyInversion;

public class Macbook {

    Keyboard keyboard;
    Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void getKeyboardAndMouseDetails(){
        keyboard.keyboardFunction();
        mouse.mouseFunction();
    }

    // wrong practice as it is hardcoding the object
    /*public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WirelessMouse();
    }*/
}
