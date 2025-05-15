import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void printList(List<?> list) {
        list.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Liam Carter", "dep1", 2500.));
        employees.add(new Employee("Ava Mitchell", "dep2", 1700.));
        employees.add(new Employee("Noah Bennett", "dep3", 3000.));
        employees.add(new Employee("Emma Reyes", "dep4", 2200.));
        employees.add(new Employee("Ethan Walker", "dep5", 2400.));

        double sum = employees.stream().mapToDouble(e -> e.getSalary()).sum();
        System.out.println("Sum: " + sum);

        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        printList(sortedEmployees);

        double min = employees.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary();
        System.out.println("Min: " + min);

        List<Employee> above2300 = employees.stream()
                .filter(e -> e.getSalary() > 2300.)
                .collect(Collectors.toList());

        printList(above2300);

        double maxSalaire = employees.stream()
                .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2).get().getSalary();
        System.out.println("Max Salary: " + maxSalaire);

        String nomsConcat = employees.stream()
                .map(Employee::getName)
                .reduce("", (n1, n2) -> n1 + " " + n2).trim();
        System.out.println("All names: " + nomsConcat);

    }
}
