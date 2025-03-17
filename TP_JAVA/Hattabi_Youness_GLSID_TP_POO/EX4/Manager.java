public class Manager extends Employee {
    public Manager() {
        super();
    }

    public Manager(String name, String surname, String email, String phone, double salary) {
        super(name, surname, email, phone, salary);
    }

    public double calculateSalary() {
        return this.getSalary() + this.getSalary() * .2;
    }
}
