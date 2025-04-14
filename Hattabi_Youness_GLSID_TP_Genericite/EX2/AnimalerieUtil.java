import java.util.List;
import java.util.Scanner;

/**
 * Utility class for managing a collection of animals.
 */
public class AnimalerieUtil {

    /**
     * Displays the list of animals and calls their parler() method.
     *
     * @param liste A list of objects that extend the Animal class.
     */
    public void afficherAnimaux(List<? extends Animal> liste) {
        for (Object obj : liste) {
            if (obj instanceof Animal) {
                Animal animal = (Animal) obj;
                System.out.println(animal);
                animal.parler();
            }
        }
    }

    /**
     * Adds a new dog to the provided list.
     *
     * @param liste A list that can accept objects of type Chien or its
     *              superclasses.
     * @return true if the dog was successfully added.
     */
    public boolean ajouterChien(List<? super Chien> liste) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the dog: ");
        String nom = scanner.nextLine();
        Chien chien = new Chien(nom);
        liste.add(chien);
        return true;
    }

    /**
     * Displays all elements in the provided list.
     *
     * @param liste A list of any type of objects.
     */
    public void afficherTout(List<?> liste) {
        for (Object obj : liste) {
            System.out.println(obj);
        }
    }
}