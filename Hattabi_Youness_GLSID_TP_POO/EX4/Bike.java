public class Bike extends Vehicule {
    private String brand;
    private int power;

    /**
     * Constructs a new instance of Bike with default values.
     *
     * @see Bike#Bike(String, double, String, int)
     */
    public Bike() {
        this("", 00.00, "", 0);
    }

    /**
     * Constructs a new instance of Bike with the provided parameters.
     *
     * @param name  The name of the bike.
     * @param price The price of the bike.
     * @param brand The brand of the bike.
     * @param power The power of the bike.
     *
     * @see Vehicule#Vehicule(String, double)
     */
    public Bike(String name, double price, String brand, int power) {
        super(name, price);
        this.brand = brand;
        this.power = power;
    }

    /**
     * Returns the brand of the bike.
     *
     * @return The brand of the bike.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Sets the brand of the bike.
     *
     * @param brand The new brand of the bike. It should be a non-null, non-empty
     *              string.
     *
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Returns the power of the bike.
     *
     * @return The power of the bike. It represents the horsepower of the bike.
     */
    public int getPower() {
        return this.power;
    }

    /**
     * Sets the power of the bike.
     *
     * @param power The new power of the bike. It represents the horsepower of the
     *              bike.
     *              The value should be a non-negative integer.
     *
     * @throws IllegalArgumentException If the provided power is negative.
     */
    public void setPower(int power) {
        if (power < 0) {
            throw new IllegalArgumentException("Power cannot be negative.");
        }
        this.power = power;
    }

    /**
     * Overrides the makeSound method from the Vehicule class to provide a specific
     * sound
     * for a bike.
     *
     * This method prints "bike says something" to the console.
     *
     * @see Vehicule#makeSound()
     */
    @Override
    public void makeSound() {
        System.out.println("bike says something");
    }

}
