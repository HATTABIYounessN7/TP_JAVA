public class CreditCard extends Payment {
    public String CardNumber;

    public CreditCard() {
        this("", .0, "");
    }

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

    @Override
    public void processPayment() {
        System.out.println("Processing payment of " + this.getAmount() + " with transaction ID: "
                + this.getTransactionId() + " using card number: " + this.CardNumber);
    }
}
