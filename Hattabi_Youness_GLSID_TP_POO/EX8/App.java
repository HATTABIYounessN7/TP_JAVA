public class App {
    /**
     * This is the main entry point of the application. It demonstrates the usage of
     * the Command design pattern
     * by creating a Command object, setting its amount and payment method, and then
     * invoking the pay method.
     *
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        Command command = new Command();
        command.setAmount(1000);
        command.setPaymentMethod(new CreditCard("5555555555", command.getAmount(), "13826822"));
        command.pay();

        command.setAmount(2000);
        command.setPaymentMethod(new PayPal("test@test.com", command.getAmount(), "62636353"));
        command.pay();
    }

}
