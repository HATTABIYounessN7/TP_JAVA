public class Plane extends Vehicule {
    private String company;
    private double maxSpeed;

    public Plane() {
        this("", .00, "", .00);
    }

    public Plane(String company, double maxSpeed, String name, double price) {
        super(name, price);
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void makeSound() {
        System.out.println("Plane sound");
    }
}
