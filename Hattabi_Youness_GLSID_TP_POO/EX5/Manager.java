public class Manager extends Employee {
    public Manager() {
        super();
    }

    public Manager(String name, String surname, String email, String phone, double salary) {
        super(name, surname, email, phone, salary);
    }

    /**
     * Calculates the salary of a manager, which includes a 20% bonus on the base
     * salary.
     *
     * @return the total salary of the manager, which is the base salary plus the
     *         bonus.
     */
    public double calculateSalary() {
        return this.getSalary() + this.getSalary() * .2;
    }

}
