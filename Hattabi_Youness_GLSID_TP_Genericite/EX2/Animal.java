/**
 * The {@code Animal} class represents a generic animal with a name.
 * It provides methods to get and set the name of the animal,
 * as well as a method to simulate the animal speaking.
 * 
 * <p>
 * This class can be extended to represent specific types of animals.
 * 
 * <p>
 * Example usage:
 * 
 * <pre>
 * Animal animal = new Animal("Lion");
 * animal.parler(); // Output: Je suis un animal
 * </pre>
 * 
 * @author Hattabi Youness
 */
public class Animal {
    private String nom;

    public Animal() {
    }

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void parler() {
        System.out.println("Je suis un animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' + "class=" + this.getClass().getSimpleName() +
                '}';
    }
}
