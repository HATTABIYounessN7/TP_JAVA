public class App {
    /**
     * The main method serves as the entry point for the application.
     * It demonstrates the creation of `Engineer` and `Manager` objects,
     * calculates their salaries, and prints their details to the console.
     *
     * Steps performed:
     * 1. Creates an `Engineer` object with predefined attributes.
     * 2. Creates a `Manager` object with predefined attributes.
     * 3. Calculates and prints the salary of the `Engineer`.
     * 4. Calculates and prints the salary of the `Manager`.
     * 5. Prints the string representation of the `Engineer`.
     * 6. Prints the string representation of the `Manager`.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Engineer engineer = new Engineer("engineer", "engineer", "engineer@test.com", "5225128246", 10000);
        Manager manager = new Manager("manager", "manager", "manager@test.com", "5225128246", 10000);

        System.out.println(engineer.calculateSalary());
        System.out.println(manager.calculateSalary());

        System.out.println(engineer);
        System.out.println(manager);
    }
}
