package SOLID.OpenClosePrinciple;

import SOLID.OpenClosePrinciple.Invoice;

public class SaveInvoideToDb implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {

        System.out.println("Save to DB" + invoice);

    }


}
