package SOLID.DependencyInversion;

public class WireMouse implements Mouse{


    @Override
    public void mouseFunction() {

        System.out.println("wire mouse");
    }
}
