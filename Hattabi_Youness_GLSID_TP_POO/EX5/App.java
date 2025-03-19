public class App {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("engineer", "engineer", "engineer@test.com", "5225128246", 10000);
        Manager manager = new Manager("manager", "manager", "manager@test.com", "5225128246", 10000);

        System.out.println(engineer.calculateSalary());
        System.out.println(manager.calculateSalary());

        System.out.println(engineer);
        System.out.println(manager);
    }
}
