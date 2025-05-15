import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Water", 3.));
        products.add(new Product(2, "Snack", 1.));
        products.add(new Product(3, "Yogurt", 2.5));

        products.forEach(System.out::println);
        System.out.println();

        products.remove(2);
        products.forEach(System.out::println);
        System.out.println();

        products.set(1, new Product(4, "Milk", 4));
        products.forEach(System.out::println);
        System.out.println();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the name of the product : ");
            String name = scanner.nextLine();
            Product toFind = products.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
            if (toFind != null)
                System.out.println(toFind);
        }
    }
}
