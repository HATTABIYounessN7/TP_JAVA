import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> notes = new HashMap<>();

        notes.put("Student1", 12.);
        notes.put("Student2", 15.5);
        notes.put("Student3", 20.);

        notes.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();

        notes.put("Student2", 16.75);
        notes.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();

        notes.remove("Student1");
        notes.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();

        System.out.println(notes.size());
        System.out.println();

        double avg = notes.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.);
        System.out.println("Average: " + avg);
        double max = notes.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.);
        System.out.println("Max: " + max);
        double min = notes.values().stream().mapToDouble(Double::doubleValue).min().orElse(0.);
        System.out.println("Min: " + min);

        Map.Entry<String, Double> best = notes.entrySet().stream().filter((e) -> e.getValue() == 20).findFirst()
                .orElse(null);
        if (best != null)
            System.out.println("Name : " + best.getKey() + " Note: " + best.getValue());

        notes.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();

    }
}
