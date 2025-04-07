import java.util.Date;

public class Adherent extends Person {
    private int numAdherent;
    private static int nbAdherent = 0;

    // This constructor `public Adherent() {...}` is the default constructor for the
    // `Adherent` class.
    // It initializes a new instance of the `Adherent` class with default values.
    public Adherent() {
        super();
        this.numAdherent = 0;
        nbAdherent++;
    }

    // This constructor `public Adherent(String name, String surname, String email,
    // String tel, Date
    // birthDate)` is a parameterized constructor for the `Adherent` class. It takes
    // in specific values for
    // the `name`, `surname`, `email`, `tel`, and `birthDate` parameters and
    // initializes a new instance of
    // the `Adherent` class with these values.
    public Adherent(String name, String surname, String email, String tel, Date birthDate) {
        super(name, surname, email, tel, birthDate);
        this.numAdherent = nbAdherent;
        nbAdherent++;
    }

    /**
     * The `getNumAdherent` function in Java returns the value of the `numAdherent`
     * attribute.
     * 
     * @return The method `getNumAdherent` is returning the value of the
     *         `numAdherent` instance variable.
     */
    public int getNumAdherent() {
        return this.numAdherent;
    }

    /**
     * The function `setNumAdherent` sets the value of the `numAdherent` instance
     * variable in a Java class.
     * 
     * @param numAdherent The `numAdherent` parameter in the `setNumAdherent` method
     *                    is an integer value
     *                    that represents the number of adherents or members to be
     *                    set for a particular entity or object. This
     *                    method is used to update or set the number of adherents to
     *                    a specific value provided as an argument
     */
    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    /**
     * The `toString` method is overridden to return a formatted string
     * representation of an `Adherent`
     * object including its attributes.
     * 
     * @return The `toString()` method is being overridden to return a string
     *         representation of an object
     *         of the `Adherent` class. The returned string includes the values of
     *         the `numAdherent`, `name`,
     *         `surname`, `email`, `tel`, and `birthDate` properties of the object.
     */
    @Override
    public String toString() {
        return "Adherent [numAdherent=" + numAdherent + ", name=" + getName() + ", surname=" + getSurname() + ", email="
                + getEmail() + ", tel=" + getTel() + ", birthDate=" + getBirthDate() + "]";
    }
}
