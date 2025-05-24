# Rapport - Travaux Pratiques : Les Threads en Java

---

## Introduction

Ce travail pratique vise à mettre en évidence les comportements classiques de la programmation multi-threads en Java à travers deux exercices pratiques. Le premier exercice explore les concepts de base des threads avec l'interface `Runnable`, tandis que le second aborde l'utilisation des pools de threads pour des calculs parallèles.

---

## Exercice 1 : Application Multi-threads Simple

### Objectif

Créer une application simple démontrant le comportement classique de la programmation multi-threads en Java.

### Spécifications Techniques

#### 1. Classe Talkative

- **Constructeur** : Prend en paramètre un entier qui devient un attribut de la classe
- **Interface** : Implémente l'interface `Runnable`
- **Méthode run()** : Affiche 100 fois la valeur de l'attribut de la classe

#### 2. Classe Principale (Main)

- **Création d'instances** : 10 instances de la classe `Thread`
- **Paramétrage** : Chaque thread prend une nouvelle instance de `Talkative`
- **Unicité** : Chaque objet `Talkative` est construit avec un entier unique
- **Exécution** : Appel de la méthode `start()` sur chaque thread

### Implémentation Attendue

```java
import java.util.ArrayList;
import java.util.List;

public class Talkative implements Runnable {
    private int i;

    public Talkative(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(this.getI());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            thread.start();
            System.out.println();
        }
    }
}
```

### Comportement Observé

L'exécution de ce programme révèle les caractéristiques fondamentales du multi-threading :

- **Exécution concurrente** : Les threads s'exécutent simultanément
- **Ordre imprévisible** : L'affichage des valeurs ne suit pas un ordre séquentiel
- **Entrelacement** : Les sorties des différents threads se mélangent
- **Non-déterminisme** : Chaque exécution produit un ordre d'affichage différent

---

## Exercice 2 : Pool de Threads pour Calcul Parallèle

### Objectif

Développer un programme utilisant un pool de threads pour calculer la somme des éléments d'un tableau de manière parallèle.

### Spécifications Techniques

#### 1. Classe Sommeur

- **Interface** : Implémente `Runnable`
- **Constructeur** :
  - Paramètres : tableau d'entiers, indice de début, indice de fin
  - Fonction : Définit la plage d'indices pour le calcul
- **Méthode getSomme()** : Retourne la somme calculée dans la plage spécifiée

#### 2. Classe Principale

- **Initialisation** : Création d'un tableau d'entiers
- **Division** : Partage du tableau en plusieurs plages
- **Pool de threads** : Utilisation d'un pool pour le calcul concurrent
- **Synchronisation** : Attente de la fin de tous les threads
- **Résultat** : Affichage de la somme totale

### Architecture de Solution

#### Structure de la Classe Sommeur

```java
import java.util.ArrayList;
import java.util.List;

public class Sommeur implements Runnable {
    private List<Integer> input;
    private int start, end, sum = 0;

    public Sommeur(List<Integer> input, int start, int end) {
        this.input = input;
        setStart(start);
        setEnd(end);
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += this.input.get(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        for (int i = 0; i < 10; i++) {
            list.add(i * 3);
        }

        Sommeur sommeur1 = new Sommeur(list, 0, 10);
        Sommeur sommeur2 = new Sommeur(list, 10, 20);
        Sommeur sommeur3 = new Sommeur(list, 20, 30);

        new Thread(sommeur1).start();
        new Thread(sommeur2).start();
        new Thread(sommeur3).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of sommeur 1 : " + sommeur1.getSum());
        System.out.println("Sum of sommeur 2 : " + sommeur2.getSum());
        System.out.println("Sum of sommeur 3 : " + sommeur3.getSum());

        System.out.println("Final Sum  : " + (sommeur1.getSum() + sommeur2.getSum() + sommeur3.getSum()));
    }
}

```

#### Stratégie de Division du Travail

- **Partitionnement** : Division du tableau en segments égaux
- **Distribution** : Attribution d'un segment à chaque thread
- **Calcul parallèle** : Exécution simultanée des calculs
- **Agrégation** : Combinaison des résultats partiels

### Avantages du Calcul Parallèle

- **Performance** : Réduction du temps de calcul sur des tableaux volumineux
- **Utilisation des ressources** : Exploitation optimale des processeurs multi-cœurs
- **Scalabilité** : Adaptation automatique au nombre de threads disponibles
- **Efficacité** : Distribution équilibrée de la charge de travail

---

## Conclusion

Ces exercices illustrent les concepts fondamentaux de la programmation multi-threads en Java. Le premier exercice démontre le comportement non déterministe des threads concurrents, tandis que le second présente une application pratique du parallélisme pour l'optimisation des performances. Ces compétences sont essentielles pour développer des applications Java efficaces et scalables dans un environnement multi-cœurs.

La maîtrise de ces concepts ouvre la voie à des techniques plus avancées comme la programmation asynchrone, les frameworks de calcul distribué, et l'optimisation des performances dans les applications enterprise.
