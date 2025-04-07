public class App {
    /**
     * This is the main entry point of the application. It creates instances of the
     * Plane, Car, and Bike classes,
     * calls their methods, and prints out their properties.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 1000, "Boeing 747", 1000000);
        plane.display();
        System.out.println(plane.getCompany());
        System.out.println(plane.getMaxSpeed());
        plane.makeSound();

        Car car = new Car("Toyota", 200.00, "Toyota Corolla", "2000");
        car.display();
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.makeSound();

        Bike bike = new Bike("Bike", 100.00, "Mountain Bike", 250);
        bike.display();
        System.out.println(bike.getBrand());
        System.out.println(bike.getPower());
        bike.makeSound();
    }

}
