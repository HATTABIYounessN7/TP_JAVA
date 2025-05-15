import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> grpA = new HashSet<>();
        Set<String> grpB = new HashSet<>();

        grpA.addAll(List.of("StudentA1", "StudentA2", "StudentA3", "StudentA4", "StudentA5"));
        grpB.addAll(List.of("StudentB1", "StudentB2", "StudentA3", "StudentB4", "StudentA5"));

        grpA.forEach(System.out::println);
        System.out.println();

        grpB.forEach(System.out::println);
        System.out.println();

        Set<String> intersection = new HashSet<>(grpA);
        intersection.retainAll(grpB);
        intersection.forEach(System.out::println);
        System.out.println();

        Set<String> union = new HashSet<>(grpA);
        union.addAll(grpB);
        union.forEach(System.out::println);

    }
}
