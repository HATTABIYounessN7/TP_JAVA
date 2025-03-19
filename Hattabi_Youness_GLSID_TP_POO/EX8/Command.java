public class Command {
    private double amount;
    private Payment paymentMethod;

    public Command() {
        this(.0, null);
    }

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

    public void pay() {
        this.paymentMethod.processPayment();
    }
}
