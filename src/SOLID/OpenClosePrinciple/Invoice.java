package SOLID.OpenClosePrinciple;

public class Invoice {

    private int invoiceId;
    private int amount;
    private int quantity;

    public Invoice(int invoiceId, int amount, int quantity) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.quantity = quantity;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}

