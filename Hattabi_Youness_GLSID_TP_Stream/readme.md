# TP Streams Java

## Description

Ce TP porte sur l'utilisation des Streams en Java pour traiter des collections d'objets de manière fonctionnelle. Il est composé de deux exercices pratiques couvrant différentes opérations de manipulation de données avec les streams.

## Table des matières

1. [Exercice 1: Manipulation de chaînes de caractères](#exercice-1-manipulation-de-chaînes-de-caractères)
2. [Exercice 2: Traitement de données d'employés](#exercice-2-traitement-de-données-demployés)

## Exercice 1: Manipulation de chaînes de caractères

### Objectif

Effectuer diverses opérations de traitement sur une liste de mots en utilisant les streams Java.

### Structure de la classe

```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(/**/));

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
```

### Opérations à implémenter

1. **Filtrage par contenu**: Filtrer les mots qui contiennent la lettre "a".
2. **Filtrage et transformation**: Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.
3. **Filtrage et aplatissement**: Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères.
4. **Transformation simple**: Transformer chaque chaîne en sa version en majuscules.
5. **Mappage vers une valeur**: Convertir chaque chaîne en sa longueur.
6. **Transformation et aplatissement**: Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.
7. **Transformation avec index**: Transformer chaque nom en une chaîne de la forme "Nom - Index" où l'index représente la position du nom dans la liste.

## Exercice 2: Traitement de données d'employés

### Objectif

Manipuler une liste d'employés à l'aide des streams Java pour effectuer différentes opérations d'analyse et de transformation.

### Classes à implémenter

#### Classe Employee

```java
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
```

#### Classe GestionEmployes

```java
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
```

### Opérations à implémenter

1. **Calcul de somme**: Utiliser `mapToDouble` et `sum` pour calculer la somme totale des salaires de tous les employés.
2. **Tri**: Utiliser `sorted` pour trier la liste des employés par ordre alphabétique du nom.
3. **Recherche de minimum**: Utiliser `min` pour trouver l'employé avec le salaire le plus bas.
4. **Filtrage**: Utiliser `filter` pour obtenir la liste des employés ayant un salaire supérieur à une valeur donnée.
5. **Réduction pour maximum**: Utiliser `reduce` pour trouver l'employé avec le salaire le plus élevé dans l'ensemble de l'entreprise.
6. **Réduction pour concaténation**: Utiliser `reduce` pour concaténer les noms de tous les employés.

## Concepts Java utilisés

- **Streams API**: Utilisation des streams pour traiter des collections de façon fonctionnelle
- **Opérations intermédiaires**: `filter()`, `map()`, `flatMap()`, `sorted()`, etc.
- **Opérations terminales**: `collect()`, `sum()`, `min()`, `reduce()`, etc.
- **Expressions lambda**: Utilisation de fonctions anonymes dans les opérations de stream
- **Method references**: Utilisation de références de méthodes comme `String::toUpperCase`
- **Classes fonctionnelles**: `Predicate`, `Function`, `Comparator`, etc.
- **Optional**: Gestion des résultats potentiellement vides
