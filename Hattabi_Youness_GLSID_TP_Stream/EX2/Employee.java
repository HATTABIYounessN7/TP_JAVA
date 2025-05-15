public class Employee {
    private String name;
    private String departement;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String departement, double salary) {
        this.name = name;
        this.departement = departement;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", departement=" + departement + ", salary=" + salary + "]";
    }

}
