public class Engineer extends Employee {

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String email, String phone, double salary) {
        super(name, surname, email, phone, salary);
    }

    public double calculateSalary() {
        return this.getSalary() + this.getSalary() * .15;
    }
}
