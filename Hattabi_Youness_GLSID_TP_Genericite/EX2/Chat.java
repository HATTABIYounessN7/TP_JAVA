/**
 * The Chat class represents a cat, which is a specific type of Animal.
 * It overrides the parler method to provide a cat-specific sound ("Miaou")
 * and customizes the toString method to include the class name and the cat's
 * name.
 * 
 * Constructors:
 * - Chat(): Creates a Chat instance with default properties.
 * - Chat(String nom): Creates a Chat instance with the specified name.
 * 
 * Methods:
 * - parler(): Prints "Miaou" to the console, representing the sound a cat
 * makes.
 * - toString(): Returns a string representation of the Chat object, including
 * its name and class.
 */
public class Chat extends Animal {
    public Chat() {
        super();
    }

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("Miaou");
    }

    @Override
    public String toString() {
        return "Chat{" +
                "nom='" + getNom() + '\'' + "class=" + this.getClass().getSimpleName() +
                '}';
    }
}