import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "Nimbus",
                "Crate",
                "Zentra",
                "Apple",
                "Vanta",
                "Pebble",
                "Quark",
                "Drift",
                "Snorkel",
                "Trundle",
                "Brisket",
                "Froodle",
                "Glyph",
                "Yonder",
                "Plexor",
                "Glimmer",
                "Thunk",
                "Spindle",
                "Aphrodite",
                "Zoodle",
                "Kettle",
                "Moof",
                "Splint",
                "Orbit",
                "Tangle",
                "Mirth",
                "Dabble",
                "Squib",
                "Aggressive",
                "Flux"));

        List<String> startsWithA = words.stream().filter((word) -> word.startsWith("a") || word.startsWith("A"))
                .collect(Collectors.toList());
        printList(startsWithA);

        List<String> longerThan3Inversed = words.stream().filter((word) -> word.length() > 3)
                .map((word) -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
        printList(longerThan3Inversed);

        List<List<Character>> containsE = words.stream()
                .filter((word) -> word.contains("e"))
                .map((word) -> word.chars().mapToObj(c -> (char) c).collect(Collectors.toList()))
                .collect(Collectors.toList());
        printList(containsE);

        List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        printList(upperCase);

        List<Integer> wordLength = words.stream().map(String::length).collect(Collectors.toList());
        printList(wordLength);

        List<Character> splitSingleList = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        printList(splitSingleList);

        List<String> indexedWords = words.stream().map(word -> word + "-" + words.indexOf(word))
                .collect(Collectors.toList());
        printList(indexedWords);
    }
}
