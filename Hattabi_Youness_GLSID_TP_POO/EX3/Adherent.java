import java.util.Date;

public class Adherent extends Person {
    private int numAdherent;
    private static int nbAdherent = 0;

    public Adherent() {
        super();
        this.numAdherent = 0;
        nbAdherent++;
    }

    public Adherent(int numAdherent, String name, String surname, String email, String tel, Date birthDate) {
        super(name, surname, email, tel, birthDate);
        this.numAdherent = numAdherent;
        nbAdherent++;
    }

    public int getNumAdherent() {
        return this.numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return "Adherent [numAdherent=" + numAdherent + ", name=" + getName() + ", surname=" + getSurname() + ", email="
                + getEmail() + ", tel=" + getTel() + ", birthDate=" + getBirthDate() + "]";
    }
}
