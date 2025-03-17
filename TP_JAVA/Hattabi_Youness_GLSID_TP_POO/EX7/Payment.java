public class Payment {
    private double amount;
    private String transactionId;

    public Payment() {
        this(.0, "");
    }

    public Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void processPayment() {
        System.out.println("Processing payment of " + this.amount + " with transaction ID: " + this.transactionId);
    }
}
