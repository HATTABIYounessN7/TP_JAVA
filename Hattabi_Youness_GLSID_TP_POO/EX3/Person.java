import java.util.Date;
import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private String email;
    private String tel;
    private Date birthDate;

    // The `public Person(String name, String surname, String email, String tel,
    // Date birthDate)`
    // constructor in the `Person` class is a parameterized constructor that
    // initializes a `Person`
    // object with the provided values for `name`, `surname`, `email`, `tel`, and
    // `birthDate`. When an
    // instance of the `Person` class is created using this constructor, the
    // instance variables `name`,
    // `surname`, `email`, `tel`, and `birthDate` are set to the values passed as
    // arguments to the
    // constructor.
    public Person(String name, String surname, String email, String tel, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.tel = tel;
        this.birthDate = birthDate;
    }

    public Person() {

    }

    /**
     * The `getName` function in Java returns the name of an object.
     * 
     * @return The `name` attribute of the current object is being returned.
     */
    public String getName() {
        return this.name;
    }

    /**
     * The function `setName` sets the value of the `name` attribute in a Java
     * class.
     * 
     * @param name The `setName` method takes a `String` parameter named `name`.
     *             This parameter represents
     *             the name that will be set for the object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The `getSurname` function in Java returns the surname of an object.
     * 
     * @return The `surname` attribute of the current object is being returned.
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * The function `setSurname` sets the value of the `surname` attribute in a Java
     * class.
     * 
     * @param surname The `setSurname` method is a setter method used to set the
     *                value of the `surname`
     *                attribute in a class. The parameter `surname` is the value
     *                that will be assigned to the `surname`
     *                attribute.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * The getEmail() function in Java returns the email associated with the object.
     * 
     * @return The getEmail() method is returning the email attribute of the current
     *         object.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * The setEmail function in Java sets the email instance variable to the
     * provided email value.
     * 
     * @param email The `setEmail` method is a setter method used to set the email
     *              address of an object.
     *              The `email` parameter is the email address that will be set for
     *              the object.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The `getTel()` function in Java returns the value of the `tel` attribute.
     * 
     * @return The `tel` attribute is being returned.
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * The function `setTel` sets the value of the `tel` instance variable in a Java
     * class.
     * 
     * @param tel The `setTel` method is a setter method used to set the value of
     *            the `tel` instance
     *            variable in a class. The `tel` parameter is the value that will be
     *            assigned to the `tel` instance
     *            variable.
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * The `getBirthDate` function in Java returns the birth date of an object.
     * 
     * @return The method `getBirthDate()` is returning the `birthDate` attribute of
     *         the current object.
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    /**
     * The function `setBirthDate` sets the birth date of an object.
     * 
     * @param birthDate The `setBirthDate` method is a setter method that sets the
     *                  `birthDate` attribute of
     *                  an object to the provided `Date` object.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * This Java function calculates a person's age based on their birth date.
     * 
     * @return The `calculateAge` method is returning the age of a person based on
     *         their birth date.
     */
    public int calculateAge() {
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(this.getBirthDate());

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);

        return age;
    }

    /**
     * The `toString` method overrides the default implementation to return a
     * formatted string
     * representation of an object's attributes.
     * 
     * @return This `toString()` method is returning a formatted string
     *         representation of an object's
     *         attributes, including name, surname, email, telephone number, and
     *         birth date.
     */
    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", surname='" + getSurname() + "'" +
                ", email='" + getEmail() + "'" +
                ", tel='" + getTel() + "'" +
                ", birthDate='" + getBirthDate() + "'" +
                "}";
    }
}
