# TP Collections Java

## Description

Ce TP porte sur l'utilisation des différentes collections en Java. Il est composé de trois exercices pratiques couvrant les listes (ArrayList), les Maps (HashMap) et les Sets (HashSet).

## Table des matières

1. [Exercice 1: Les listes](#exercice-1-les-listes)
2. [Exercice 2: Les Maps](#exercice-2-les-maps)
3. [Exercice 3: Les Sets](#exercice-3-les-sets)

## Exercice 1: Les listes

### Objectif

Créer une application simple pour manipuler une liste de produits en utilisant `ArrayList`.

### Classes implémentées

#### Classe Produit

````java
public class Product {
    private long id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}```

#### Classe GestionProduitsApp
```java
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
````

### Fonctionnalités implémentées

- Création d'une liste de produits
- Ajout de produits à la liste
- Suppression d'un produit par indice
- Affichage de la liste des produits
- Modification d'un produit par indice
- Recherche d'un produit par nom saisi par l'utilisateur

## Exercice 2: Les Maps

### Objectif

Manipuler une structure de données `HashMap` pour gérer les notes d'étudiants.

### Classe implémentée

```java
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
```

### Fonctionnalités implémentées

- Création d'un HashMap pour stocker les notes des étudiants
- Insertion des notes
- Augmentation de la note d'un étudiant
- Suppression de la note d'un étudiant
- Affichage de la taille du map
- Calcul et affichage de la note moyenne, maximale et minimale
- Vérification de l'existence d'une note égale à 20
- Affichage du contenu du map après chaque opération avec forEach et expressions lambda

## Exercice 3: Les Sets

### Objectif

Manipuler des ensembles (`HashSet`) pour gérer des groupes d'étudiants et effectuer des opérations d'ensemble.

### Classe implémentée

```java
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
```

### Fonctionnalités implémentées

- Création de deux HashSets pour représenter deux groupes d'étudiants
- Ajout d'étudiants dans chaque groupe
- Calcul et affichage de l'intersection des deux groupes (étudiants présents dans les deux groupes)
- Calcul et affichage de l'union des deux groupes (tous les étudiants sans doublons)
