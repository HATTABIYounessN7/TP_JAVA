public class Command {
    private double amount;
    private Payment paymentMethod;

    public Command() {
        this(.0, null);
    }

    /**
     * Constructs a new Command object with the specified amount and payment method.
     *
     * @param amount        The total amount of the command.
     * @param paymentMethod The payment method used for this command.
     */
    public Command(double amount, Payment paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Payment getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Processes the payment for this command using the specified payment method.
     *
     * @see Payment#processPayment()
     */
    public void pay() {
        this.paymentMethod.processPayment();
    }
}