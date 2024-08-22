package SOLID.singleResponsibilty;

public class Invoice {

    private int invoiceId;
    private int amount;
    private int quantity;

    public int calInvoice(int amount, int quantity){
        return amount * quantity;
    }

    //These methods should be present in different classes.
    // public void printInvoice();
    //public void saveInvoice();


}
