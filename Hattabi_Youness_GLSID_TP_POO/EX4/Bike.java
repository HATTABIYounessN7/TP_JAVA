public class Bike extends Vehicule {
    private String brand;
    private int power;

    public Bike() {
        this("", 00.00, "", 0);
    }

    public Bike(String name, double price, String brand, int power) {
        super(name, price);
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void makeSound() {
        System.out.println("bike says something");
    }
}
