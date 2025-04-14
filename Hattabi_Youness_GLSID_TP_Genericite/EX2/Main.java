import java.util.List;
import java.util.ArrayList;

/**
 * The Main class demonstrates the usage of generic methods and wildcards
 * in Java by working with lists of different types (Chien, Animal, Object).
 * 
 * It performs the following operations:
 * - Creates lists of Chien, Animal, and Object.
 * - Adds elements to these lists.
 * - Uses the AnimalerieUtil class to:
 * - Display animals from lists of Chien and Animal.
 * - Add Chien objects to lists of various types.
 * - Display all elements from lists of various types.
 * 
 * Note:
 * - The method `afficherAnimaux` is commented out for the list of Object
 * because it may not be compatible with the expected type constraints.
 */
public class Main {
    public static void main(String[] args) {
        List<Chien> listChien = new ArrayList<>();
        listChien.add(new Chien("Chien1"));
        listChien.add(new Chien("Chien2"));

        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Animal("Animal1"));
        listAnimal.add(new Animal("Animal2"));

        List<Object> listObject = new ArrayList<>();
        listObject.add(new Object());
        listObject.add(new Chien("Chien3"));
        listObject.add(new Animal("Animal3"));

        AnimalerieUtil utils = new AnimalerieUtil();
        utils.afficherAnimaux(listChien);
        utils.afficherAnimaux(listAnimal);
        /* utils.afficherAnimaux(listObject); */

        utils.ajouterChien(listChien);
        utils.ajouterChien(listAnimal);
        utils.ajouterChien(listObject);

        utils.afficherTout(listChien);
        utils.afficherTout(listAnimal);
        utils.afficherTout(listObject);
    }
}