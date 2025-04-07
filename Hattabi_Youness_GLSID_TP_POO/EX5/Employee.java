public abstract class Employee {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private double salary;

    /**
     * Constructs a new Employee object with default values.
     *
     */
    public Employee() {
    }

    /**
     * Constructs a new Employee object with the provided details.
     *
     * @param name    The first name of the employee.
     * @param surname The last name of the employee.
     * @param email   The email address of the employee.
     * @param phone   The phone number of the employee.
     * @param salary  The salary of the employee.
     *
     */
    public Employee(String name, String surname, String email, String phone, double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    /**
     * Retrieves the first name of the employee.
     *
     * @return The first name of the employee.
     *
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param name The first name of the employee. It should be a non-null,
     *             non-empty string.
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the last name of the employee.
     *
     * @return The last name of the employee.
     *
     */
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

    /**
     * Calculates the salary of the employee based on their specific role and
     * responsibilities.
     * This method is abstract and must be implemented by each subclass of Employee.
     *
     * @return The calculated salary of the employee.
     *
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone + ", salary="
                + salary + "]";
    }
}
