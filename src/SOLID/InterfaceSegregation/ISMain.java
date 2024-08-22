package SOLID.InterfaceSegregation;

//No interface should have an unneccessary functionality added to them,
// Like waiter interface should have serving functionality, not the cooking, the cooking should be a cooks function.
//there should be separate interface for each functionality.
public class ISMain {
    public static void main(String[] args) {


        Cook cook = new Cook() {
            @Override
            public void cooking() {
                System.out.println("Cooking");
            }
        };

        Waiter waiter = new Waiter() {
            @Override
            public void serving() {
                System.out.println("Serving");
            }
        };

        // Calling the methods
        cook.cooking();
        waiter.serving();

        // two different interface 2 diff work, no one is doing someone else's task.
    }
}
