public class Vehicule {
    private String name;
    private double price;

    public Vehicule() {
        this("", 00.00);
    }

    public Vehicule(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("make sound");
    }

    public void display() {
        System.out.println("Name: " + this.name + " Price: " + this.price);
    }
}
