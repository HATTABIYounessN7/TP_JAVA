import java.util.Date;

public class Author extends Person {
    private static int nbAuthor = 0;
    private int numAuthor;

    // The `public Author() { ... }` constructor in the `Author` class is a default
    // constructor that
    // initializes an `Author` object with default values.
    public Author() {
        super();
        this.numAuthor = 0;
        nbAuthor++;
    }

    // This constructor in the `Author` class is a parameterized constructor that
    // takes in `name`,
    // `surname`, `email`, `tel`, and `birthDate` as arguments to initialize an
    // `Author` object with
    // specific values.
    public Author(String name, String surname, String email, String tel, Date birthDate) {
        super(name, surname, email, tel, birthDate);
        this.numAuthor = nbAuthor;
        nbAuthor++;
    }

    /**
     * The function `getNumAuthor` returns the value of the `numAuthor` attribute.
     * 
     * @return The method `getNumAuthor` is returning the value of the `numAuthor`
     *         field.
     */
    public int getNumAuthor() {
        return this.numAuthor;
    }

    /**
     * This function sets the number of authors for a given object.
     * 
     * @param numAuthor The `numAuthor` parameter is an integer value that
     *                  represents the number of
     *                  authors associated with a particular entity or object.
     */
    public void setNumAuthor(int numAuthor) {
        this.numAuthor = numAuthor;
    }

    /**
     * The `toString` method in Java returns a string representation of an object's
     * attributes.
     * 
     * @return The `toString` method is being overridden to return a string
     *         representation of an object
     *         of the class `Adherent`. The returned string includes the values of
     *         the `numAuthor`, `name`,
     *         `surname`, `email`, `tel`, and `birthDate` attributes of the
     *         `Adherent` object.
     */
    @Override
    public String toString() {
        return "Adherent [numAuthor=" + numAuthor + ", name=" + getName() + ", surname=" + getSurname() + ", email="
                + getEmail() + ", tel=" + getTel() + ", birthDate=" + getBirthDate() + "]";
    }

}
