/**
 * The Chien class represents a dog, which is a subclass of the Animal class.
 * It overrides the parler method to provide a specific implementation for dogs
 * and includes a custom toString method for representing the object as a
 * string.
 * 
 * Constructors:
 * - Chien(): Creates a new Chien instance with default values.
 * - Chien(String nom): Creates a new Chien instance with the specified name.
 * 
 * Methods:
 * - parler(): Prints "Wouf" to the console, representing the sound a dog makes.
 * - toString(): Returns a string representation of the Chien object, including
 * its name and class type.
 */
public class Chien extends Animal {
    public Chien() {
        super();
    }

    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("Wouf");
    }

    @Override
    public String toString() {
        return "Chien{" +
                "nom='" + getNom() + '\'' + "class=" + this.getClass().getSimpleName() +
                '}';
    }
}