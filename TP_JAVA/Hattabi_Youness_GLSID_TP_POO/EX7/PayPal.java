public class PayPal extends Payment {
    public String email;

    public PayPal() {
        this("", .0, "");
    }

    public PayPal(String email, double amount, String transactionId) {
        super(amount, transactionId);
        this.email = email;
    }

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
