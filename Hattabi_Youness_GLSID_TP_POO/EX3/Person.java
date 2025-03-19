import java.util.Date;
import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private String email;
    private String tel;
    private Date birthDate;

    public Person(String name, String surname, String email, String tel, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.tel = tel;
        this.birthDate = birthDate;
    }

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int calculateAge() {
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(this.getBirthDate());

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);

        return age;
    }

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
