public class Plane extends Vehicule {
    private String company;
    private double maxSpeed;

    /**
     * Constructs a new Plane object with default values.
     *
     * @param company  The name of the company that manufactures the plane. Default
     *                 value is an empty string.
     * @param maxSpeed The maximum speed of the plane in kilometers per hour.
     *                 Default value is 0.00.
     * @param name     The name of the plane. Default value is an empty string.
     * @param price    The price of the plane in euros. Default value is 0.00.
     */
    public Plane() {
        this("", .00, "", .00);
    }

    /**
     * Constructs a new Plane object with the provided parameters.
     *
     * @param company  The name of the company that manufactures the plane.
     *                 Default value is an empty string.
     * @param maxSpeed The maximum speed of the plane in kilometers per hour.
     *                 Default value is 0.00.
     * @param name     The name of the plane. Default value is an empty string.
     * @param price    The price of the plane in euros. Default value is 0.00.
     */
    public Plane(String company, double maxSpeed, String name, double price) {
        super(name, price);
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Retrieves the name of the company that manufactures the plane.
     *
     * @return The name of the company that manufactures the plane.
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * Sets the name of the company that manufactures the plane.
     *
     * @param company The name of the company that manufactures the plane.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Retrieves the maximum speed of the plane in kilometers per hour.
     *
     * @return The maximum speed of the plane.
     */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Sets the maximum speed of the plane in kilometers per hour.
     *
     * @param maxSpeed The maximum speed of the plane. It should be a positive
     *                 value.
     *                 If a negative value is provided, it will be set to 0.00.
     *
     * @return void. This method does not return any value.
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = Math.max(0.00, maxSpeed);
    }

    /**
     * Overrides the makeSound method from the Vehicule class to provide a specific
     * sound for a Plane object.
     *
     * @return void. This method does not return any value.
     *
     * @see Vehicule#makeSound()
     */
    @Override
    public void makeSound() {
        System.out.println("Plane sound");
    }

}
