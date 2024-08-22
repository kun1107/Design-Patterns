package SOLID.singleResponsibilty;

public class SaveInvoice {

    private Invoice invoice;

    public Invoice saveInvoiceToDb(Invoice invoice){
        //save(invoice)
        return invoice;
    }
}
