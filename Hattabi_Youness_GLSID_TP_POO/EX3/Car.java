public class Car extends Vehicule {
    private String model;
    private String Year;

    public Car() {
        this("", 00.00, "", "");
    }

    public Car(String name, double price, String model, String Year) {
        super(name, price);
        this.model = model;
        this.Year = Year;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return this.Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    @Override
    public void makeSound() {
        System.out.println("car says something");
    }
}
