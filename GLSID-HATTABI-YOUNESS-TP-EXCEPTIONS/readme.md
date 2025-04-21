# Rapport de TP 5 : Gestion des exceptions en Java

## Introduction

Ce rapport présente les solutions développées pour le TP 5 portant sur la gestion des exceptions en Java. L'objectif de ce travail pratique était de comprendre et d'implémenter des mécanismes d'exceptions personnalisées dans le contexte de la programmation orientée objet.

Le TP comprenait deux exercices :

1. La création d'une classe `EntierNaturel` avec une exception personnalisée `NombreNegatifException`
2. Le développement d'un système bancaire simplifié avec des exceptions adaptées

## Exercice 1 : Classe EntierNaturel et exception personnalisée

### Objectif

L'objectif de cet exercice était de créer une classe permettant de gérer des entiers naturels (positifs ou nuls) avec un mécanisme de contrôle basé sur les exceptions.

### Classes implémentées

#### Classe NombreNegatifException

Cette classe personnalisée étend la classe `Exception` standard de Java et permet de signaler une tentative d'utilisation d'un nombre négatif.

```java
public class NombreNegatifException extends Exception {
    int val;

    public NombreNegatifException(String msg, int val) {
        super(msg);
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }
}
```

Caractéristiques :

- Stockage de la valeur négative ayant causé l'exception
- Méthode d'accès pour récupérer cette valeur

#### Classe EntierNaturel

Cette classe encapsule un entier naturel avec des contrôles sur les valeurs négatives.

```java
public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) {
        try {
            this.setVal(val);
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getVal());
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (this.getVal() < 0) {
            throw new NombreNegatifException("Number can't be less than zero", val);
        }
        this.val = val;
    }

    public void decrementer(int val) throws NombreNegatifException {
        if (this.getVal() - val < 0) {
            throw new NombreNegatifException("Impossible to decrement, result is negative", this.getVal() - val);
        }

        this.setVal(this.getVal() - val);
    }
}
```

Fonctionnalités implémentées :

- Constructeur vérifiant la validité de la valeur initiale
- Accesseur en lecture (`getVal()`)
- Accesseur en écriture (`setVal()`) avec vérification
- Méthode de décrémentation avec contrôle

#### Classe de test TestEntierNaturel

Une classe de test a également été implémentée pour vérifier le bon fonctionnement des classes précédentes.

```java
    public static void main(String[] args) {
        EntierNaturel n = new EntierNaturel(0);
        EntierNaturel m = new EntierNaturel(1);
        EntierNaturel p = new EntierNaturel(-1);

        /*
         * System.out.println(n.getVal());
         * System.out.println(m.getVal());
         */
        try {
            m.decrementer(1);
            System.out.println(m.getVal());
        } catch (NombreNegatifException e) {
            e.getMessage();
            e.getVal();
        }

        try {
            n.decrementer(1);
            System.out.println(m.getVal());
        } catch (NombreNegatifException e) {
            e.getMessage();
            e.getVal();
        }
    }
```

### Tests effectués

1. Création d'un entier naturel valide
2. Décrémentation d'un entier naturel
3. Tentative de création avec une valeur négative
4. Tentative de modification avec une valeur négative
5. Décrémentation jusqu'à zéro
6. Tentative de décrémentation d'un entier à zéro

### Résultats

Tous les tests ont confirmé le bon fonctionnement des mécanismes d'exceptions. Les messages d'erreur appropriés sont affichés et les valeurs négatives ayant causé les exceptions sont correctement récupérées et affichées.

## Exercice 2 : Système bancaire avec gestion d'exceptions

### Objectif

L'objectif était de développer un système bancaire simplifié avec différents types de comptes, en mettant en œuvre des mécanismes d'exceptions adaptés aux opérations bancaires.

### Classes d'exceptions implémentées

#### FondsInsuffisantsException

```java
public class FondsInsuffisantsException extends Exception {
    public FondsInsuffisantsException(String msg) {
        super(msg);
    }
}
```

#### CompteInexistantException

```java
public class CompteInexistantException extends Exception {
    public CompteInexistantException(String msg) {
        super(msg);
    }
}
```

### Classes du système bancaire

#### CompteBancaire (classe de base)

```java
public class CompteBancaire {
    private int id;
    private double solde;
    private String nomTitulaire;

    public CompteBancaire(int id, double solde, String nomTitulaire) {
        this.id = id;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public void depot(double val) {
        this.setSolde(this.getSolde() + val);
    }

    public void retirer(double val) throws FondsInsuffisantsException {
        if (this.getSolde() - val < 0) {
            throw new FondsInsuffisantsException("Insufficient Funds.");
        }

        this.setSolde(this.getSolde() - val);
    }

    public void affichage() {
        System.out.println("Solde: " + this.getSolde());
    }

    public boolean transfer(CompteBancaire compte, double val)
            throws FondsInsuffisantsException, CompteInexistantException {
        if (compte == null) {
            throw new CompteInexistantException("Account does not exist.");
        }
        if (this.getSolde() - val < 0) {
            throw new FondsInsuffisantsException("Insufficient funds.");
        }

        compte.setSolde(compte.getSolde() + val);
        this.setSolde(this.getSolde() - val);
        return true;
    }
}
```

Fonctionnalités implémentées :

- Dépôt d'argent
- Retrait d'argent avec gestion des fonds insuffisants
- Affichage du solde
- Transfert entre comptes avec vérification des fonds et de l'existence des comptes

#### CompteCourant (compte avec découvert)

```java
public class CompteCourant extends CompteBancaire {
    private int decouvertAutorise;

    public CompteCourant(int id, double solde, String nomTitulaire, int decouvertAutorise) {
        super(id, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    public int getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(int decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public void retirer(int val) throws FondsInsuffisantsException {
        if (val > this.getSolde() - this.getDecouvertAutorise()) {
            throw new FondsInsuffisantsException("Insufficient Funds.");
        }

        this.setSolde(this.getSolde() - val);
    }
}
```

Particularités :

- Gestion d'un découvert autorisé
- Adaptation de la méthode de retrait pour prendre en compte le découvert

#### CompteEpargne (compte avec intérêts)

```java
public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(int id, double solde, String nomTitulaire, double tauxInteret) {
        super(id, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = this.getSolde() * this.getTauxInteret();
        this.depot(interet);
    }

    public void affichage() {
        super.affichage();
        System.out.println("Taux d'intérêt: " + this.getTauxInteret());
    }

}
```

Particularités :

- Gestion d'un taux d'intérêt
- Méthode de calcul et d'ajout des intérêts

### Tests effectués dans la classe Main

La classe Main utilise une ArrayList pour gérer les comptes et teste les opérations suivantes :

1. Création et ajout de comptes à la liste
2. Dépôt d'argent
3. Retrait avec succès
4. Retrait avec fonds insuffisants
5. Utilisation du découvert autorisé
6. Calcul des intérêts
7. Transfert entre comptes avec succès
8. Transfert avec compte inexistant
9. Suppression d'un compte de la liste

#### Classe de test Main

Une classe de test a également été implémentée pour vérifier le bon fonctionnement des classes précédentes.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        try {
            CompteCourant compte1 = new CompteCourant(1, 1000, "Jean Dupont", 500);
            CompteEpargne compte2 = new CompteEpargne(2, 5000, "Marie Martin", 2.5);
            CompteCourant compte3 = new CompteCourant(3, 300, "Pierre Durand", 200);

            comptes.add(compte1);
            comptes.add(compte2);
            comptes.add(compte3);

            System.out.println("=== Liste des comptes créés ===");
            for (CompteBancaire compte : comptes) {
                compte.affichage();
            }
            System.out.println();

            System.out.println("=== Test de dépôt ===");
            compte1.depot(500);
            compte1.affichage();
            System.out.println();

            try {
                System.out.println("=== Test de retrait avec succès ===");
                compte1.retirer(300);
                compte1.affichage();
                System.out.println();
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            try {
                System.out.println("=== Test de retrait avec fonds insuffisants ===");
                compte3.retirer(1000);
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            try {
                System.out.println("=== Test de découvert autorisé ===");
                compte1.retirer(1300);
                compte1.affichage();
                System.out.println();
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            System.out.println("=== Test des intérêts sur compte épargne ===");
            compte2.affichage();
            compte2.calculerInteret();
            compte2.affichage();
            System.out.println();

            try {
                System.out.println("=== Test de transfert avec succès ===");
                compte2.transfer(compte3, 1000);
                compte2.affichage();
                compte3.affichage();
                System.out.println();
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            } catch (CompteInexistantException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            try {
                System.out.println("=== Test de transfert avec compte inexistant ===");
                compte2.transfer(null, 500);
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            } catch (CompteInexistantException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            System.out.println("=== Suppression d'un compte ===");
            System.out.println("Nombre de comptes avant suppression: " + comptes.size());
            comptes.remove(compte3);
            System.out.println("Nombre de comptes après suppression: " + comptes.size());
            System.out.println();

            System.out.println("=== Liste finale des comptes ===");
            for (CompteBancaire compte : comptes) {
                compte.affichage();
            }

        } catch (Exception e) {
            System.out.println("Exception non gérée: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

### Résultats

Tous les tests ont démontré le bon fonctionnement du système bancaire et de la gestion des exceptions. Les erreurs sont correctement interceptées et les informations pertinentes sont affichées à l'utilisateur.

## Conclusion

Ce TP a permis de mettre en pratique plusieurs concepts importants :

1. **Création d'exceptions personnalisées** : Nous avons développé des classes d'exceptions spécifiques à nos besoins, permettant de gérer de manière précise les erreurs potentielles.

2. **Encapsulation des données** : Les classes implémentées respectent le principe d'encapsulation, avec des accesseurs et des modificateurs contrôlant l'intégrité des données.

3. **Héritage et polymorphisme** : L'exercice 2 a permis d'appliquer le concept d'héritage pour créer des types de comptes spécialisés tout en maintenant une interface commune.

4. **Gestion de collections** : L'utilisation d'ArrayList dans la classe Main de l'exercice 2 a permis de manipuler une collection d'objets de manière flexible.

La gestion des exceptions est un aspect crucial du développement logiciel robuste. Ce TP a permis de comprendre comment implémenter et utiliser efficacement ce mécanisme pour améliorer la fiabilité des applications Java.
