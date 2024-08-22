package SOLID.OpenClosePrinciple;

import SOLID.OpenClosePrinciple.Invoice;

public class SaveInvoideToFile implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
        System.out.println("Save invoice to file");
    }
}
