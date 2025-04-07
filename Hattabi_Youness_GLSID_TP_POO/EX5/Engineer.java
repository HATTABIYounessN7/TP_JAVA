public class Engineer extends Employee {

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String email, String phone, double salary) {
        super(name, surname, email, phone, salary);
    }

    /**
     * Calculates the engineer's salary after applying a 15% bonus.
     *
     * @return the engineer's salary after the bonus has been added.
     */
    public double calculateSalary() {
        return this.getSalary() + this.getSalary() * .15;
    }

}
