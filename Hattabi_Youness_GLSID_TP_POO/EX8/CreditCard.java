public class CreditCard extends Payment {
    public String CardNumber;

    public CreditCard() {
        this("", .0, "");
    }

    /**
     * Constructs a CreditCard object with the specified card number, amount, and
     * transaction ID.
     *
     * @param CardNumber    The credit card number associated with the transaction.
     * @param amount        The amount of the transaction.
     * @param transactionId The unique identifier for the transaction.
     */
    public CreditCard(String CardNumber, double amount, String transactionId) {
        super(amount, transactionId);
        this.CardNumber = CardNumber;
    }

    public String getCardNumber() {
        return this.CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    /**
     * Processes the payment associated with this credit card transaction.
     * Prints a message indicating the amount, transaction ID, and card number used
     * for the payment.
     */
    @Override
    public void processPayment() {
        System.out.println("Processing payment of " + this.getAmount() + " with transaction ID: "
                + this.getTransactionId() + " using card number: " + this.CardNumber);
    }

}
