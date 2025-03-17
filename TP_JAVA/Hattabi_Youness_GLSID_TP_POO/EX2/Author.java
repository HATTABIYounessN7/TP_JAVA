import java.util.Date;

public class Author extends Person {
    private static int nbAuthor = 0;
    private int numAuthor;

    public Author() {
        super();
        this.numAuthor = 0;
        nbAuthor++;
    }

    public Author(int numAuthor, String name, String surname, String email, String tel, Date birthDate) {
        super(name, surname, email, tel, birthDate);
        this.numAuthor = numAuthor;
        nbAuthor++;
    }

    public int getNumAuthor() {
        return this.numAuthor;
    }

    public void setNumAuthor(int numAuthor) {
        this.numAuthor = numAuthor;
    }

    @Override
    public String toString() {
        return "Adherent [numAuthor=" + numAuthor + ", name=" + getName() + ", surname=" + getSurname() + ", email="
                + getEmail() + ", tel=" + getTel() + ", birthDate=" + getBirthDate() + "]";
    }

}
