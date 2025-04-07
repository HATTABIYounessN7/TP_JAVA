public class Payment {
    private double amount;
    private String transactionId;

    public Payment() {
        this(.0, "");
    }

    /**
     * Constructs a Payment object with the specified amount and transaction ID.
     *
     * @param amount        the amount of the payment
     * @param transactionId the unique identifier for the transaction
     */
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

    /**
     * Processes the payment by printing a message with the payment amount and
     * transaction ID.
     *
     * @param amount        The amount of the payment.
     * @param transactionId The unique identifier for the payment transaction.
     * @return void
     */
    public void processPayment() {
        System.out.println("Processing payment of " + this.amount + " with transaction ID: " + this.transactionId);
    }

}
