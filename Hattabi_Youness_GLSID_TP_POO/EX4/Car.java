public class Car extends Vehicule {
    private String model;
    private String Year;

    /**
     * Constructs a new Car object with default values.
     *
     * @param name  The name of the car. Default value is an empty string.
     * @param price The price of the car. Default value is 0.00.
     * @param model The model of the car. Default value is an empty string.
     * @param Year  The manufacturing year of the car. Default value is an empty
     *              string.
     */
    public Car() {
        this("", 00.00, "", "");
    }

    /**
     * Constructs a new Car object with the provided parameters.
     *
     * @param name  The name of the car. Default value is an empty string.
     * @param price The price of the car. Default value is 0.00.
     * @param model The model of the car. Default value is an empty string.
     * @param Year  The manufacturing year of the car. Default value is an empty
     *              string.
     */
    public Car(String name, double price, String model, String Year) {
        super(name, price);
        this.model = model;
        this.Year = Year;
    }

    /**
     * Retrieves the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Sets the model of the car.
     *
     * @param model The new model of the car. It should be a non-null, non-empty
     *              string.
     *              If the provided model is null or empty, the model remains
     *              unchanged.
     */
    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
    }

    /**
     * Retrieves the manufacturing year of the car.
     *
     * @return The manufacturing year of the car. It is a non-null, non-empty
     *         string.
     *         If the manufacturing year is not set, it returns an empty string.
     */
    public String getYear() {
        return this.Year;
    }

    /**
     * Sets the manufacturing year of the car.
     *
     * @param Year The new manufacturing year of the car. It should be a non-null,
     *             non-empty string. If the provided manufacturing year is null or
     *             empty, the manufacturing year remains unchanged.
     */
    public void setYear(String Year) {
        this.Year = Year;
    }

    /**
     * Overrides the makeSound method from the Vehicule class to provide a specific
     * sound for a car.
     *
     * This method prints "car says something" to the console when called.
     *
     * @return This method does not return any value.
     */
    @Override
    public void makeSound() {
        System.out.println("car says something");
    }

}
