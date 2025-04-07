public class PayPal extends Payment {
    public String email;

    public PayPal() {
        this("", .0, "");
    }

    /**
     * Constructs a new PayPal payment instance with the specified email, amount,
     * and transaction ID.
     *
     * @param email         The email address associated with the PayPal account.
     * @param amount        The amount of the payment.
     * @param transactionId The unique identifier for the transaction.
     */
    public PayPal(String email, double amount, String transactionId) {
        super(amount, transactionId);
        this.email = email;
    }

    /**
     * Processes the payment by printing a message with the payment amount,
     * transaction ID, and email.
     *
     * @see Payment#processPayment()
     */
    @Override
    public void processPayment() {
        System.out.println("Processing payment of " + this.getAmount() + " with transaction ID: "
                + this.getTransactionId() + " using email: " + this.email);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
