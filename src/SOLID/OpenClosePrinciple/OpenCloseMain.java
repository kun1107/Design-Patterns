package SOLID.OpenClosePrinciple;

import SOLID.OpenClosePrinciple.Invoice;

//A Class should be open for extension and close for modification
// in this case you should use interfaces to implement your code logic
// this will help you in extension wihtout modifying currently working code
public class OpenCloseMain {

    public static void main(String[] args) {

        Invoice invoice = new Invoice(1,2,3);

        InvoiceDao invoiceDao = new SaveInvoideToDb();

        invoiceDao.save(invoice);





    }
}
