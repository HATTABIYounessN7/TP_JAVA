public class Vehicule {
    private String name;
    private double price;

    /**
     * Constructs a new Vehicule object with default values.
     *
     * @param name  The name of the vehicle. Default value is an empty string.
     * @param price The price of the vehicle. Default value is 00.00.
     */
    public Vehicule() {
        this("", 00.00);
    }

    /**
     * Constructs a new Vehicule object with the given name and price.
     *
     * @param name  The name of the vehicle. It cannot be null or an empty string.
     * @param price The price of the vehicle. It cannot be negative.
     */
    public Vehicule(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the vehicle.
     *
     * @return The name of the vehicle. It cannot be null or an empty string.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the price of the vehicle.
     *
     * @return The price of the vehicle. It cannot be negative.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the name of the vehicle.
     *
     * @param name the name to set for the vehicle
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of the vehicle.
     *
     * @param price The price to set for the vehicle. It cannot be negative.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This method makes a sound, which is currently defined as printing "make
     * sound" to the console.
     * This method is intended to be overridden in subclasses to provide more
     * specific sound behavior.
     *
     * @return This method does not return any value.
     */
    public void makeSound() {
        System.out.println("make sound");
    }

    /**
     * This method displays the name and price of the vehicle.
     *
     * @return This method does not return any value. It prints the name and price
     *         of the vehicle to the console.
     */
    public void display() {
        System.out.println("Name: " + this.name + " Price: " + this.price);
    }

}
