public abstract class Employee {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String email, String phone, double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone + ", salary="
                + salary + "]";
    }
}
